package com.example.groot.controller;

import com.example.groot.GrootApplication;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GrootApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
					MediaType.APPLICATION_JSON.getSubtype(),
					Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testStatusOkGroot() throws Exception {
		mockMvc.perform(get("/groot").param("message", "some"))
						.andExpect(status().isOk())
						.andExpect(jsonPath("$.received", is("some")))
						.andExpect(jsonPath("$.translated", is("I am Groot!")));
	}

	@Test
  public void sameReceivedAsExpectedGroot() throws Exception {
    mockMvc.perform(get("/groot").param("message", ""))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void testStatusOkYondu() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "10.0"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.distance", is(100.0)))
            .andExpect(jsonPath("$.time", is(10.0)))
            .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void zeroReceivedAsExpectedYondu() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "0"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error", is("Distance or Time cannot be zero!")));
  }
}

