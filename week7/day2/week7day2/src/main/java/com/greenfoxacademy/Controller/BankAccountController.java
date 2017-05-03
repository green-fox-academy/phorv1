package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {


  @RequestMapping(value = "/Exercise1")
  public String bankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute(bankAccount);
    return "bank-account";
  }

  @RequestMapping(value = "/Exercise4")
  public String printMessage(Model model) {
    String inputString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("inputString", inputString);
    return "this-is-html";
  }
}
