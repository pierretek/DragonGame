package gr11.culm;


/*
*Programmer: Pierre Awad
*Date: June 7 2022
*Description: For Culminating I'm making an RGP Game
about Slaying a Dragon
*/
import java.util.Scanner;
import java.text.*;

class Gr11Culm {

  public static void main(String[] args) {

    // Making the Scanners
    Scanner scanS = new Scanner(System.in);
    Scanner scanN = new Scanner(System.in);

    // Making the Decimal Formatter
    DecimalFormat decFor = new DecimalFormat("###,###");

    //Initialzing Useful Variables for Dialogue Purposes
    String choice;
    String name = "";

    // Introducing the Game using an NPC called Villager
    System.out.println("\n[VILLAGER]: Greetings Peasant,");
    System.out.println("[VILLAGER]: A ferocious dragon is" +
        " terrorising our kingdom");
    System.out.println("\n[VILLAGER]: We would ask the local knight" +
        " to come and slay them..");
    System.out.println("[VILLAGER]: But he's taking a vacation" +
        " in Cuba with his mistress");
    System.out.println("\n[VILLAGER]: So me and the other " +
        "villagers were wondering if \nYOU could come and slay them" +
        " for us");
    System.out.println("\n[VILLAGER]: You seem powerful enough.");
    System.out.println("\n[VILLAGER]: Would you care to help us" +
        " out?");
    System.out.println("[VILLAGER]: We will reward you handsomely" +
        " if you succeed");
    System.out.print("\n\tYour Answer (Yes or No): ");

    choice = scanS.nextLine();

   

    // If User Chooses Yes
    if (choice.equalsIgnoreCase("yes")) {
      System.out.println("\n[VILLAGER]: Really? Thank you my" +
          " good.. Uh..");

      // Gathering and Storing the User's Name
      System.out.println("[VILLAGER]: What would you like me" +
          " to call you?");
      System.out.print("\n\t Your Name: ");
      name = scanS.nextLine();

      // Greeting User With Their Own Name
      System.out.println("\n[VILLAGER]: " + name +
          " ah yes, my good " + name +
          ", well let's get right to it!");

      // If User Chooses No
    } else {
      System.out.println("\n[VILLAGER]: Too bad, it's an " +
          "order from the king, lets go!");
    }

    // The Villager Leads the Player to the Dragon's Cave
    System.out.println("\n* He Leads You Through the Village" +
        " to the Outskirts of Town *");
    System.out.println("* Suddenly, He Points at a Gaping" +
        " Cave in a Rocky Hill *\n");
    System.out.println("[VILLAGER]: It's in there, good luck!");
    System.out.println("\n* He Bravely Turns Around and" +
        " Sprints Away");
    System.out.println("* The Ground Shakes, Thumping Footsteps Echo" +
        " from the Cave *\n");
    System.out.println("* As Your Impending Doom Approaches, You " +
        "Begin to Question Yourself *\n");

    /*
     Asking a Question Purely to Pace the Game Better and to Avoid
     Immediately Cutting to the Boss
     */
    System.out.println("Do You Really Want to Risk Your Life? ");
    System.out.print("\n\t Your Choice: ");

    // Reusing the choice variable
    choice = scanS.nextLine();

    // Telling User "Good Luck" If they Said "yes"
    if (choice.equalsIgnoreCase("yes")) {
      System.out.println("\n* Good Luck *");

      // Otherwise Telling User "Too Late"
    } else {
      System.out.println("\n* Too Late *");
    }

    // Displaying the Dragon Art
    System.out.println("\n\tTHE DRAGON EMERGES...\n");
    System.out.print("                 ___====-_  _-====___ "+
        "\n           _--^^^#####//      \\\\#####^^^--_"+
        "\n        _-^##########// (    ) \\\\##########^-_"+
        "\n       -############//  |\\^^/|  \\\\############-"+
        "\n     _/############//   (@::@)   \\\\############\\_"+
        "\n   -###############\\\\    (oo)    //###############-"+
        "\n  -#################\\\\  / VV \\  //#################-"+
        "\n -###################\\\\/      \\//###################-"+
        "\n_#/|##########/\\######(   /\\   )######/\\##########|\\#_"+
        "\n|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/"+
        "  \\/#/\\#| \\#| \\|" +
        "\n`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '"+
        "\n   `   `  `      `   / | |  | | \\   '      '  '   '"+
        "\n                    (  | |  | |  )"+
        "\n                   __\\ | |  | | /__");

    // Couple Lines of Dragon Dialogue
    System.out.println("\n\n[DRAGON]: YOU DARE CHALLENGE ME?");
    System.out.println("[DRAGON]: YOU WILL PAY FOR" +
        " THIS FOOLISHNESS\n");

    // Creating all the Variables Needed for the Game
    int bossChoice;
    int potion = 0;
    int userHp = 1000;
    int bossHp = 10000;
    Boolean run = false;
    int battleChoice;

    // Containing the Battle Menu in a Do While Loop
    do {

      // Displaying the Dragon's Health 
      System.out.println("\tDragon's Health (" +
          decFor.format(bossHp) + ")");

      // Displaying Dragon's Health Bar using Two For Loops
      System.out.print("\t|");
      for (int bar = 0; bar < (bossHp / 500); bar++) {
        System.out.print("*");
      }
      for (int bar = 0; bar < (20 - (bossHp / 500)); bar++) {
        System.out.print(" ");
      }
      System.out.print("|");

      // Displaying the User's Health 
      System.out.println("\n\tYour Health (" +
          decFor.format(userHp) + ")");

      // Displaying User's Health Bar using Two For Loops
      System.out.print("\t|");
      for (int bar = 0; bar < (userHp / 50); bar++) {
        System.out.print("*");
      }
      for (int bar = 0; bar < (20 - (userHp / 50)); bar++) {
        System.out.print(" ");
      }
      System.out.print("|");
      System.out.println("\n");

      // Displaying the Battle Menu
      System.out.println("\t-Battle Menu-" +
          "\n\t1 = Attack" +
          "\n\t2 = Heal" +
          "\n\t3 = Run Away and Scream" +
          "\n\t4 = Drink Mystery Potion" +
          "\n\t5 = Roll Magic Dice");
      System.out.print("\nYour Choice: ");

      // Error Trapping using a Do While Loop
      do {

        //Scanning User Input
        battleChoice = scanN.nextInt();
        System.out.print("\n");

        //If the Choice is Not Within 1-5
        if (battleChoice > 5 || battleChoice < 0) {

          //Notifying User and Repeating the Prompt
          System.out.println("-Sorry That Is Not a Valid Option-" +
              "\nPlease Choose an Option from 1 - 5");
          System.out.print("\nYour Choice: ");
        }
      } while (battleChoice > 5 || battleChoice < 0);

      // Storing the Potion Effect from the Potion Method
      int effect = potion;

      /*
       Using a Switch Statment to Run the Appropiate Methods
       For the User's Choice
       */
      switch (battleChoice) {
        case 1: { // If user Chose "Attack"
          lines(); // This Method is Purely for Formatting
          bossHp = attack(effect, bossHp);
          potion = 0; // Resetting Potion Effect after Attack
          break;
        }
        case 2: { // If user Chose "Heal"
          lines();
          userHp = heal(userHp);
          break;
        }
        case 3: { // If user Chose "Run Away"
          run = true;
          break;
        }
        case 4: { // If user Chose "Drink Potion"
          lines();
          potion = Potion();
          break;
        }
        case 5: {
          lines(); // If user Chose "Roll Dice"
          bossHp = dice(bossHp);
          break;
        }
      }

      // If the Boss is Alive and the User Didn't Run
      if (bossHp > 0 && run == false) {

        // Randomizing the Dragon's Choice from 1-2
        bossChoice = (int) (1 + Math.random() * 3);

        // Switch Statement to Decide Which Action the Boss Will Do
        switch (bossChoice) {
          case 1: { // If the Boss Decides to Heal
            bossHp = bossChoice(bossChoice, userHp, bossHp);
            lines();
            System.out.println("\n");
            break;
          }
          default: { // If the Boss Attacks
            userHp = bossChoice(bossChoice, userHp, bossHp);
            lines();
            System.out.println("\n");
            break;
          }
        }

        // Just Displaying the Lines For Formatting Purposes
      } else {
        lines();
      }

      // End of Battle Loop
    } while (userHp > 0 && bossHp > 0 && run == false);

    // If the User Ran Away
    if (run == true) {

      // Printing "YOU RAN!"
      System.out.println(
          "\n__   __  ___   _   _        ___" +
              "  ___  _  _   _   " +
              "\n\\ \\ / / / _ \\ | | | |" +
              "      | _ \\/   \\| \\| | | | " +
              "\n \\   / | (_) || |_| |      |" +
              "   /| - || .  | |_|  " +
              "\n  |_|   \\___/  \\___/" +
              "       |_|_\\|_|_||_|\\_| (_) ");

      // Randomizing the Dragon's Reaction
      int index = (int) (Math.random() * 6);

      // Storing the Dialogue Options in an Array
      String[] bossTaunt = {
          "HEY GET BACK HERE",
          "WHY ARE YOU RUNNING",
          "WHERE ARE YOU GOING",
          "COME BACK HERE",
          "WHERE DO YOU THINK YOU'RE GOING",
          "WAIT FOR ME" };

      // Printing the Dragon's Reaction
      System.out.println("\n[DRAGON]: " + bossTaunt[index]);

      // Describing the Villagers Reaction
      System.out.print("\n* You Turn Around and Sprint Away *" +
          "\n* The Villager Sees You and Facepalms *" +
          "\n\n[VILLAGER]: Cmon, "); 

      //Refering to the User by Their Name or Just Peasant
      if (name.length() > 0) {
        System.out.print(name);
      } else {
        System.out.print("peasant");
      }

      //Ending the Game with Some Dialogue
      System.out.print(" you didn't even try?");
      System.out.print("\n[VILLAGER]: You failed us, let's hope" +
          " the knight \nfinishes his vacation soon\n");
      System.out.println("\nThe End.");

      // If The User Beat the Dragon
    } else if (bossHp <= 0) {

      // Randomizing the Dragon's Final Words
      int index = (int) (Math.random() * 6);

      // Storing the Dialogue Options in an Array
      String[] bossFinalWords = {
          "OW THAT HURT!",
          "I DONT FEEL SO GOOD",
          "CURSE YOU AND YOUR DETERMINATION",
          "NOOOOOOOOOOOOOOOOOOOO",
          "IT WASN'T FAIR",
          "GOODBYE CRUEL WORLD" };

      // Printing the Dragon's Final Words
      System.out.println("\n\n[DRAGON]: " + bossFinalWords[index]);

      // Printing "DRAGON DOWN!"
      System.out.println(" ___   ___  ___" +
          "   ___   ___   _  _     ___" +
          "    ___  __      __ _  _   _   " +
          "\n|   \\ | _ \\/   \\ / __| / _ \\ | \\| |   |" +
          "   \\  / _ \\ \\ \\    / /| \\| | | |  " +
          "\n| |) ||   /| - || (_ || (_) || .  |   |" +
          " |) || (_) | \\ \\/\\/ / | .  | |_|  " +
          "\n|___/ |_|_\\|_|_| \\___| \\___/ |_|\\_|" +
          "   |___/  \\___/   \\_/\\_/  |_|\\_| (_)  ");

      // Ending the Game With some Dialogue
      System.out.println("\nCONGRATS! You Defeated the Dragon" +
          " and Saved the Villagers!");
      System.out.print("\n[VILLAGER]: Thank you, ");

      //Refering to the User by Their Name or Just Peasant
      if (name.length() > 0) {
        System.out.print(name);
      } else {
        System.out.print("peasant");
      }

      //Ending the Game With Some Dialogue
      System.out.print(" I knew you could do it!" +
          "\n[VILLAGER]: Here, Enjoy this" +
          " Massive chest full of valuable treasure," +
          "\nyou've earned it\n");

      // Printing a Trashcan for a Comedic Moment
      System.out.println("  ________ " + "\n /_______/" +
          "\n|\\ ______\\" +
          "\n||       |   It was a Trashcan..." +
          "\n\\|_______|");
      System.out.println("\nThe End.");

      // If the User Lost to the Dragon
    } else if (userHp <= 0) {

      // Randomizing the Dragon's Taunting Message
      int index = (int) (Math.random() * 6);

      // Storing the Dialogue Options in an Array
      String[] bossTaunt = {
          "PREPARE TO PERISH",
          "YOUR STORY ENDS HERE",
          "TIME TO MEET YOUR MAKER",
          "GOODBYE NUISANCE",
          "NICE TRY FOOL",
          "DID YOU REALLY THINK YOU COULD BEAT ME?" };

      // Printing the Dragon's Taunting Message
      System.out.println("[DRAGON]: " + bossTaunt[index]);

      // Printing "YOU LOST!"
      System.out.println(
          "__   __  ___   _   _        _" +
              "      ___   ___  _____   _     " +
              "\n\\ \\ / / / _ \\ | | | |" +
              "      | |    / _ \\ / __||_   _| | |" +
              "\n \\   / | (_) || |_| |      " +
              "| |__ | (_) |\\__ \\  | |   |_|   " +
              "\n  |_|   \\___/  \\___/       " +
              "|____| \\___/ |___/  |_|   (_)  ");

      // Describing the Final Moments
      System.out.println("\n* The Dragon Roars at" +
          " You One Final Time *" +
          "\n* This time, Scorching Flames" +
          " Blast out of Their Mouth," +
          "\nEngulfing You in Fire *" +
          "\n* You are Burnt to a Crisp… *");

      // Printing a Skull
      System.out.print("\n    .-------." +
          "\n   /         \\" + "\n  (   X    X  )" +
          "\n   \\    M    /        It was a Valiant Effort, ");

      // Printing the Name if it is Gathered, Otherwise Saying Peasant
      if (name.length() > 0) {
        System.out.print(name);
      } else {
        System.out.print("random peasant");
      }

      // Finishing the Game
      System.out.println("\n    | IIIII |" +
          "\n    `-------'");
      System.out.println("\nThe End.");
    }

    // Closing the Scanners
    scanN.close();
    scanS.close();
  }

  // The attack Method
  public static int attack(int potion, int bossHp) {

    // Declaring the Decimal Formatter for Use
    DecimalFormat decFor = new DecimalFormat("###,###");

    // Randomizing the User's Damage and the Dragon's Block Chance
    int damage = (int) (500 + Math.random() * 500);
    int block = (int) (1 + Math.random() * 5);

    // If a Potion is Active, Disabling the Dragon's Block
    if (potion > 0) {
      block = 0;
    }

    // Doubling Damage if the Potion Equals 2
    if (potion == 2) {
      System.out.print("\n(The Potion Doubled Your Damage!)");
      damage = damage * 2;

      // Halving Damage if the Potion Equals 1
    } else if (potion == 1) {
      System.out.print("\n(The Potion Halved Your Damage!)");
      damage = damage / 2;

      // Blocking the Hit if Block Equals 5
    } else if (block == 5) {
      System.out.println("\nThe Dragon Blocked Your attack!");
      return bossHp;
    }

    // Subtracting the Damage from the bossHp
    bossHp -= damage;

    // If it's the Last Hit of the Game
    if (bossHp <= 0) {
      System.out.print("\n-FINAL HIT-");
    }

    // Telling the User How much Damage they Did
    System.out.println("\nYou Dealt " + decFor.format(damage) +
        " to the Dragon!");

    // Telling the User If they Got a Critical Hit
    if (damage > 850 && potion == 0) {
      System.out.println("-CRITICAL HIT!-");
    }

    // Ending the Method
    return bossHp;
  }

  // The healing Method
  public static int heal(int userHp) {

    // Randomizing the User's Healing Amount
    int heal = (int) (200 + Math.random() * 200);

    // Telling the User How Much they Healed
    System.out.println("\nYou healed yourself for " + heal +
        " Health Points!");

    // Adding the Healing to the User's Health
    userHp += heal;

    // Capping the Health at 1000 and Notifying User
    if (userHp > 1000) {
      userHp = 1000;
      System.out.println("(Max Health Reached)");
    }

    // Ending the Method
    return userHp;
  }

  // The potion Method
  public static int Potion() {

    // Randomizing the Potion Effect
    int potion = (int) (1 + Math.random() * 2);

    // Describing What the User Did
    System.out.println("\nYou sipped from a " +
        "Mysterious Bottle in Your Pocket,\n");

    // Describing What Happens to the User According to the Potion
    if (potion == 2) {
      System.out.println("CONGRATS! The Potion Strenghtened" +
          " your Muscles, \nYour Next attack will be Doubled!");
    } else if (potion == 1) {
      System.out.println("UH OH! The Potion made you Dizzy," +
          " \nYour Next attack Will be half as effective");
    }

    // Ending the Method
    return potion;
  }

  // The dice Method
  public static int dice(int bossHp) {

    // Randomizing the Dice Value
    int dice = (int) (1 + Math.random() * 6);

    // Dealing 6,000 Damage if the User Rolled a 6
    if (dice == 6) {
      System.out.println("\nLUCKY! You Rolled a 6!");
      System.out.println("This Somehow Deals 6,000 Damage" +
          " to the Dragon!");
      bossHp -= 6000;

      // Otherwise Explaining What Will Happen If The User Rolls a 6
    } else {
      System.out.println("\nYou Rolled a " + dice + " !");
      System.out.println("(Rolling a 6 Will deal 6,000 Damage" +
          " To the Dragon)");
    }

    // End of Method
    return bossHp;
  }

  // The boss choice Method
  public static int bossChoice(int choice, int userHp, int bossHp) {

    // Randomizing the Dragon's Damage and Healing
    int heal = (int) (400 + Math.random() * 200);
    int damage = (int) (100 + Math.random() * 200);

    // If the Boss's Choice is 1
    if (choice == 1) {

      // Healing the Boss and Telling the user
      System.out.println("\nThe Dragon Heals itself for " +
          heal + " Heal Points!");
      bossHp += heal;

      // Capping the Dragon's Hp at 10,000
      if (bossHp > 10000) {
        bossHp = 10000;
      }

      // Ending Method
      return bossHp;

      // If the Boss's Choice is Anything Else
    } else {

      // Attacking the User and Telling Them
      userHp -= damage;

      // If It's the Final Hit of the Game
      if (userHp <= 0) {
        System.out.print("\n-FINAL HIT-");
      }
      System.out.println("\nThe Dragon attacks You Dealing " +
          damage + " Damage!");

      // Ending the Method
      return userHp;
    }
  }
  /*
   The lines Method
   (purely for Output Formating and Code Organization)
   */
  public static void lines() {

    // The Beggining of the Line
    System.out.print("<>");

    // Using a For Loop to Print the Line
    for (int i = 0; i < 45; i++) {
      System.out.print("-");
    }

    // The End of the Line
    System.out.print("<>");
  }
} //That's All Folks!