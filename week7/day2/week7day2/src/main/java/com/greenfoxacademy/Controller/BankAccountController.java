package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping(value = "/Exercise1-3")
  public String bankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true, true);
    model.addAttribute(bankAccount);
    return "bank-account";
  }

  @RequestMapping(value = "/Exercise4")
  public String printMessage(Model model) {
    String inputString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("inputString", inputString);
    return "this-is-html";
  }

  @RequestMapping(value = "/Exercise5-9")
  public String showArrayList(Model model) {
    List<BankAccount> bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Pumba", 101, "warthog", false, false));
    bankAccounts.add(new BankAccount("Timon", 100, "meerkat ", false, true));
    bankAccounts.add(new BankAccount("Rafiki", 4000, "monkey", false, true));
    bankAccounts.add(new BankAccount("Mufasa", 6789, "lion", true, true));
    bankAccounts.add(new BankAccount("Zazu", 10, "hornbill", false, false));
    model.addAttribute("bankAccounts", bankAccounts);
    return "arraylist";
  }

}
