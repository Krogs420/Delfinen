package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrator {
    Scanner input = new Scanner(System.in);
    public void makeNewMember() {
        ArrayList <Member> memberlist = new ArrayList<Member>();
        System.out.println("Create an id");
        String iD = input.nextLine();
      System.out.println("What is the members name?");
      String name = input.nextLine();
      System.out.println("What is the members age?");
      int age = input.nextInt();
      input.nextLine();
      System.out.println("What is the members mail?");
      String mail = input.nextLine();
      System.out.println("Is the member active?");
      boolean active = input.nextBoolean();
      System.out.println("Is the member junior or senior?");
     boolean senior = input.nextBoolean();
      System.out.println("Is member a competitor?");
      boolean comp = input.nextBoolean();
      Member member = new Member(iD,name,age,mail,active,
              senior,comp);
      memberlist.add(member);
        for (int i = 0; i < memberlist.size(); i++) {
            System.out.println(memberlist.get(i));
        }
  }
    }

