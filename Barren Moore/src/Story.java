
 import java.util.Scanner;

public class Story {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String weapon;
		String extra;
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		Scanner p = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		Scanner w = new Scanner(System.in);
		Scanner e = new Scanner(System.in);
		
		int steps = 400;
		
		System.out.println("Would you like to start the Barren Moore Adventure?");
		String start = sc.nextLine();
			
		System.out.println("Let the adventure begin");
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Character name?");
		
		String name = s.nextLine();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Once upon a time, a young man named " + name + " found himself on a deserted island." );
		Thread.sleep(3000);
		
		System.out.println("He stood up, patted himself down and then he saw a watch on his wrist, but it did not look like an ordinary watch.'This was a Magical one!!!'");
		Thread.sleep(3000);
		
		System.out.println(name + " tapped the watch and suddenly it started to GLOW and the number 500 appeared.");
		Thread.sleep(3000);
		
		System.out.println("The hand on the watch is pointing in a direction(North), when you spin around the hand moves.");
		Thread.sleep(3000);
		
		System.out.println("When you take a step in the direction it is pointing the number on the dial goes down.");
		
		System.out.println(" ");
		System.out.println("What will you do, go north or not?");
		
		String direction = d.nextLine();
		
		if(direction.equals("north")) {
		System.out.println("The number on the dial goes down by 2 for every step");
		}
		else {System.out.println(name + " dies to being lazy");
		System.exit(0);
				}
		
		Thread.sleep(3000);
		System.out.println(" ");
		
		
		System.out.println(name + " is a walking through the forest, enjoying the view and beauty of nature. Dial is at 400 now");
		Thread.sleep(3000);
		
		System.out.println("Suddenly, you hear some movement in the bushes.");
		Thread.sleep(2000);
		
		System.out.println("a Black Panther appears!!!!");
		Thread.sleep(2000);
		
		System.out.println(" ");
		System.out.println("What will you do, run or fight?");
		
		String panther = p.nextLine();
		
		if(panther.equals("run")) {
		System.out.println(name+ " starts to run throught the forrest, jumping over branches and anything in his way, trying to save his life. 'The numbers on the dial go down by 5 for every step now'");
		}
		else {System.out.println("Bad choice " + name + " gets shredded by panther's CLAWS!!!!!");
		System.exit(0);
				}
		
		Thread.sleep(2000);
		
		while(steps>200) {
			
			if(steps == 340) System.out.println("Ducks from a tree branch");
			
			if(steps == 300) System.out.println("Jumps over a small stream");
			
			if(steps == 240) System.out.println("Jumps over massive tree trunk");
			
			else System.out.println("RUN!!!");
			Thread.sleep(2000);
			
			steps = steps - 20;
			
		}
		
	{	
		System.out.println(name + " escapes and finds a hidding spot where the black panther could not find him, That was a close one!!");
		
		System.out.println(" ");
		Thread.sleep(3000);
		
		System.out.println("You catch your breath and rest, you look at the dial and its at 200 now");
		Thread.sleep(3000);
		
		System.out.println("After some rest its time for "+ name+ " to continue with his journey. He starts to walk to the destination.");
		Thread.sleep(3000);
		
		System.out.println("20 minutes later " + name+ " finally reaches his destination.");
		Thread.sleep(3000);
	}

		System.out.println("type 'view'");
		
		String view = l.nextLine();
		System.out.println(" ");
		
		if(view.equals("view")) {
		System.out.println(name + " looks up to see a broken helicopter with lots of crates around it. Unfortunately there were no survivors :(");
		}
		else {
			System.exit(0);
			
		}
		Thread.sleep(2000);
	
		
		{
			
		System.out.println("You go down there and start looking through the crates");
		Thread.sleep(2000);
		
		System.out.println("You find lots of random things, you see a backpack and start filling it with clothes, food and a water bottle");
		Thread.sleep(2000);
		
		System.out.println("While looking around you open a crate and find many weapons");
		Thread.sleep(2000);
	
		System.out.println("Choose a weapon to take: Sniper(20 bullets), Rifle(32 bullets) or a long sharp Sword");
		Thread.sleep(2000);
		
		weapon = w.nextLine();
		
		System.out.println(" ");
		Thread.sleep(2000);
		}
		
		{
			
		System.out.println("You got space for one more thing in your backpack, you can take a ammunation 'box' with 100 bullets or medical 'kit'?");
		Thread.sleep(2000);
		
		System.out.println("What do you take, box or kit?");
		
		extra = e.nextLine();
		
		System.out.println(" ");
		Thread.sleep(2000);
		}
		
		
		System.out.println(name + " looks at the watch and taps it. The hand starts to spin and the numbers start to change like crazy.");
		Thread.sleep(2000);
		
		System.out.println("It all stops and the hand points at a different direction now and the dial is at 300");
		Thread.sleep(2000);
		
		System.out.println(" ");
		System.out.println(name + " starts to walk in the new direction");
		Thread.sleep(2000);
			
			
			System.out.println("On your path you are making good progress, then suddenly.");
			Thread.sleep(2000);	
			
			{
				if(weapon.equals("sniper") && extra.equals("kit")) {
					System.out.println("You spot the black panther far away just laying in your path from a distance and decide to shoot it");
					Thread.sleep(3000);
					
					System.out.println("Sniper breaks making a loud noise, panther hears it and attacks you. "+ name+" is dead" );
					Thread.sleep(3000);
					
					System.exit(0);
				}
				
				if(weapon.equals("sniper") && extra.equals("box")) {
					System.out.println("You spot the black panther far away just laying in your path from a distance and decide to shoot it");
					Thread.sleep(3000);
					
					System.out.println("Sniper breaks making a loud noise, panther hears it and attacks you. "+ name+" is dead" );
					Thread.sleep(3000);
					
					System.exit(0);
				}
				
				if(weapon.equals("rifle") && extra.equals("kit")) {
					System.out.println("You hear something in the bushes so u decide to shoot a bullet, out comes a group of charging animals at you. "+ name+ " starts to shoot them");
					Thread.sleep(3000);
					
					System.out.println("You run out of bullets quickly and get stampeded by the pack of animals. "+ name+" is a pancake now" );
					Thread.sleep(3000);
					
					System.exit(0);
				}
				
				if(weapon.equals("rifle") && extra.equals("box")) {
					System.out.println("You hear something in the bushes so u decide to shoot a bullet, out comes a group of charging animals at you. "+ name+ " starts to shoot them");
					Thread.sleep(3000);
					
					System.out.println("You run out of bullets quickly and get stampeded by the pack of animals before you have time to reload. "+ name+" is a pancake now" );
					Thread.sleep(3000);
					
					System.exit(0);
				}
				
				if(weapon.equals("sword") && extra.equals("kit")) {
					System.out.println("As you are walking you hear something hiss then feel pain in your right leg. A King Cobra bit your thing so you attack it with your sword");
					Thread.sleep(3000);
					
					System.out.println("The sword slices through the King Cobra's head killing it and you successfully use the kit to save you from the poison" );
					Thread.sleep(3000);
					
				}
				
				if(weapon.equals("sword") && extra.equals("box")) {
					System.out.println("As you are walking you hear something hiss then feel pain in your right leg. A King Cobra bit your thing so you attack it with your sword");
					Thread.sleep(3000);
					
					System.out.println("The sword slices through the King Cobra's head killing it but the poison has spread and you die" );
					Thread.sleep(3000);
					
					System.exit(0);
				}
			}
			
			Thread.sleep(4000);
			
			System.out.println("You continue walking through the path and finally reach the end.");
			Thread.sleep(2000);
			System.out.println("You see a huge mountain and you are staring at it from the bottom of the mountain.");
			Thread.sleep(2000);
			System.out.println("The watch glows and starts to make a beeping noise.");
			Thread.sleep(2000);
			System.out.println("All of a sudden a hidden door opens at the bottom of the mountain");
			Thread.sleep(2000);
			
			
			System.out.println(name+ " enters the door and sees something he never thought he would ever see");
			Thread.sleep(2000);
			System.out.println("It was a treasure chest and behind it were a few skeletons");
			Thread.sleep(2000);
			System.out.println(name+ " can not believe the amount of gold in the chest and touches it.");
			Thread.sleep(2000);
			System.out.println("A huge rumble happens and the doors shut with "+name+ " still inside and now is trapped");
			Thread.sleep(4000);
			
			System.out.println("Legend says he never found a way out and died");
			Thread.sleep(2000);
			System.out.println("Do not be a GOLD DIGGER!!!!!!!");
			
			System.exit(0);
			
 
		sc.close();
		s.close();
		d.close();
		p.close();
		l.close();
		w.close();
		e.close();
	}

}
