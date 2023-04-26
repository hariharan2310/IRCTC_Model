import java.util.Scanner;
class IRCTC 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		boolean b=true;
		do{
			System.out.println("\n\t\t\tIRCTC Welcomes You");
			System.out.println("\t1.Book Ticket\n\t2.Exit");
			int input=sc.nextInt();
			if(input==1)
				{
				System.out.println("\n\tFrom");
				System.out.println("\t  1.CHENNAI\n\t  2.COIMBATORE\n\t  3.THANJAVUR");
				int from=sc.nextInt();
				System.out.println("\n\tTo");
				System.out.println("\t  1.CHENNAI\n\t  2.COIMBATORE\n\t  3.THANJAVUR");
				int to=sc.nextInt();
				if(from==to)
				{
					System.out.println("Origin And Destination Cannot Be Same");
				}
				else if(from==1 && to==2)
				{
					mscbe();
				}
				else if(from==1 && to==3)
				{
					mstj();
				}
				else if (from==2 && to==1)
				{
					cbems();
				}
				else if (from==2 && to==3)
				{
					cbetj();
				}
				else if (from==3 && to==1)
				{
					tjms();
				}
				else if (from==3 && to==2)
				{
					tjcbe();
				}
				else
				{
					System.out.println("Wrong Input");
				}
				}
				else if (input==2)
				{
					System.out.println("Thank You");
					b=false;
				}
				else
				{
					System.out.println("Wrong Input");
				}
		}while(b);
	}
	public static void mscbe() throws Exception{
		System.out.println("\n2 Results Found");
		System.out.println("\n1.CBE Intercity");
		System.out.println("\t(14.30)MGR Chennai CTL-------->Coimbatore JN(22.15)");
		System.out.println("\n2.Cheran Express");
		System.out.println("\t(22.00)MGR Chennai CTL-------->Coimbatore JN(06.00)");
		int wish=sc.nextInt();
		if(wish==1)
		{
			System.out.println("\nCBE Intercity");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.2S\n    2.CC");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=190;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Coimbatore");
				System.out.println("\n    Your Train is CBE Intercity");
				System.out.println("    Your Train Timing is 14.30 & Class Type is 2S");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=685;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Coimbatore");
				System.out.println("\n    Your Train is CBE Intercity");
				System.out.println("    Your Train Timing is 14.30 & Class Type is CC");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else if(wish==2)
		{
			System.out.println("\nCheran Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.1A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=190;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Coimbatore");
				System.out.println("\n    Your Train is Cheran Express");
				System.out.println("    Your Train Timing is 22.00 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=685;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Coimbatore");
				System.out.println("\n    Your Train is Cheran Express");
				System.out.println("    Your Train Timing is 22.00 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else
		{
			System.out.println("Worng Input");
		}
	}
	public static void mstj() throws Exception{
		System.out.println("\n2 Results Found");
		System.out.println("\n1.Chozhan Express");
		System.out.println("\t(07.15)Chennai Egmore-------->Thanjavur(13.10)");
		System.out.println("\n2.Tiruchendur Express");
		System.out.println("\t(16.05)Chennai Egmore-------->Thanjavur(22.33)");
		int wish=sc.nextInt();
		if(wish==1)
		{
			System.out.println("\nChozhan Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.2S\n    2.SL");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=155;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Thanjavur");
				System.out.println("\n    Your Train is Chozhan Express");
				System.out.println("    Your Train Timing is 07.15 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=260;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Thanjavur");
				System.out.println("\n    Your Train is Chozhan Express");
				System.out.println("    Your Train Timing is 07.15 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else if(wish==2)
		{
			System.out.println("\nTiruchendur Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.1A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=230;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Thanjavur");
				System.out.println("\n    Your Train is Tiruchendur Express");
				System.out.println("    Your Train Timing is 16.05 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=1465;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Chennai To Thanjavur");
				System.out.println("\n    Your Train is Tiruchendur Express");
				System.out.println("    Your Train Timing is 16.05 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else
		{
			System.out.println("Worng Input");
		}
	}
	public static void cbems() throws Exception{
		System.out.println("\n2 Results Found");
		System.out.println("\n1.Kovai Express");
		System.out.println("\t(15.15)Coimbatore JN-------->MGR Chennai CTL(22.50)");
		System.out.println("\n2.Chennai Express");
		System.out.println("\t(21.55)Coimbatore JN-------->MGR Chennai CTL(05.30)");
		int wish=sc.nextInt();
		if(wish==1)
		{
			System.out.println("\nKovai Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.2S\n    2.CC");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=190;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Chennai");
				System.out.println("\n    Your Train is Kovai Express");
				System.out.println("    Your Train Timing is 15.15 & Class Type is 2S");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=685;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Chennai");
				System.out.println("\n    Your Train is Kovai Express");
				System.out.println("    Your Train Timing is 15.15 & Class Type is CC");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else if(wish==2)
		{
			System.out.println("\nChennai Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.1A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=325;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Chennai");
				System.out.println("\n    Your Train is Chennai Express");
				System.out.println("    Your Train Timing is 21.55 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=1960;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Chennai");
				System.out.println("\n    Your Train is Chennai Express");
				System.out.println("    Your Train Timing is 21.55 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else
		{
			System.out.println("Worng Input");
		}
	}
	public static void cbetj() throws Exception{
		System.out.println("\n2 Results Found");
		System.out.println("\n1.Chemmozhi Express");
		System.out.println("\t(00.30)Coimbatore JN-------->Thanjavur(05.58)");
		System.out.println("\n2.ERS KIK Express");
		System.out.println("\t(03.15)Coimbatore JN-------->Thanjavur(08.53)");
		int wish=sc.nextInt();
		if(wish==1)
		{
			System.out.println("\nChemmozhi Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.1A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=205;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Thanjavur");
				System.out.println("\n    Your Train is Chemmozhi Express");
				System.out.println("    Your Train Timing is 00.30 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=1175;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Thanjavur");
				System.out.println("\n    Your Train is Chemmozhi Express");
				System.out.println("    Your Train Timing is 00.30 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else if(wish==2)
		{
			System.out.println("\nERS KIK Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.2A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=205;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Thanjavur");
				System.out.println("\n    Your Train is ERS KIK Express");
				System.out.println("    Your Train Timing is 03.15 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=710;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Coimbatore To Thanjavur");
				System.out.println("\n    Your Train is ERS KIK Express");
				System.out.println("    Your Train Timing is 03.15 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else
		{
			System.out.println("Worng Input");
		}
	}
	public static void tjms() throws Exception{
		System.out.println("\n2 Results Found");
		System.out.println("\n1.Chozhan Express");
		System.out.println("\t(11.05)Thanjavur-------->Chennai Egmore(17.30)");
		System.out.println("\n2.Uzhavan Express");
		System.out.println("\t(21.55)Thanjavur-------->Chennai Egmore(04.25)");
		int wish=sc.nextInt();
		if(wish==1)
		{
			System.out.println("\nChozhan Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.2S\n    2.SL");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=155;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Chennai");
				System.out.println("\n    Your Train is Chozhan Express");
				System.out.println("    Your Train Timing is 11.05 & Class Type is 2S");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=260;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Chennai");
				System.out.println("\n    Your Train is Chozhan Express");
				System.out.println("    Your Train Timing is 11.05 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else if(wish==2)
		{
			System.out.println("\nUzhavan Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.1A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=205;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Chennai");
				System.out.println("\n    Your Train is Uzhavan Express");
				System.out.println("    Your Train Timing is 21.55 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=1465;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Chennai");
				System.out.println("\n    Your Train is Uzhavan Express");
				System.out.println("    Your Train Timing is 21.55 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else
		{
			System.out.println("Worng Input");
		}
	}
	public static void tjcbe() throws Exception{
		System.out.println("\n2 Results Found");
		System.out.println("\n1.KIK ERS Express");
		System.out.println("\t(18.25)Thanjavur-------->Coimbatore(01.22)");
		System.out.println("\n2.Chemmozhi Express");
		System.out.println("\t(21.35)Thanjavur-------->Coimbatore(04.45)");
		int wish=sc.nextInt();
		if(wish==1)
		{
			System.out.println("\nKIK ERS Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.2A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=205;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Coimbatore");
				System.out.println("\n    Your Train is KIK ERS Express");
				System.out.println("    Your Train Timing is 18.25 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=710;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Coimbatore");
				System.out.println("\n    Your Train is KIK ERS Express");
				System.out.println("    Your Train Timing is 18.25 & Class Type is 2A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else if(wish==2)
		{
			System.out.println("\nChemmozhi Express");
			System.out.println("\nPlease Select The Class");
			System.out.println("    1.SL\n    2.1A");
			int classtype=sc.nextInt();
			if(classtype==1)
			{
				int twos_fair=205;
				System.out.println("\n  Your Fair For Your Travel is: "+twos_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*twos_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Coimbatore");
				System.out.println("\n    Your Train is Chemmozhi Express");
				System.out.println("    Your Train Timing is 21.35 & Class Type is SL");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else if(classtype==2)
			{
				int cc_fair=1175;
				System.out.println("Your Fair For Your Travel is: "+cc_fair);
				System.out.println("\nEnter The Total Num of Seats");
				int total_seats=sc.nextInt();
				System.out.println("\nEnter The Passenger Details");
				for(int i=1;i<=total_seats;i++)
				{
					System.out.println("\nPassenger "+i+" Details");
					System.out.print("Name:  ");
					String psg_name=sc.next();
					System.out.print("Age:  ");
					int psg_Age=sc.nextInt();
					System.out.print("Gender:  ");
					String psg_Gender=sc.next();
				}
				
				int total_fair=total_seats*cc_fair;
				System.out.print("\nYour Total Cost For Your Travel Is "+total_fair);
				System.out.println("\n  Your Journy is From Thanjavur To Coimbatore");
				System.out.println("\n    Your Train is Chemmozhi Express");
				System.out.println("    Your Train Timing is 21.35 & Class Type is 1A");
				System.out.println("\nSelect 1 to Continue");
				int inp=sc.nextInt();
				if(inp==1)
				{
					System.out.println("Your Total Ticket Cost is "+total_fair);
					System.out.println("\nPlease Select the Payment Mode");
					System.out.println("   1.G-Pay\n   2.PayTM");
					int pay=sc.nextInt();
					if(pay==1)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else if (pay==2)
					{
						System.out.print("\nPlease Enter The Amount  ");
						int amt=sc.nextInt();
						if(amt==total_fair)
						{
						double sys_otp=Math.random()*9999+9999;
						int Otp=(int)sys_otp;
						Thread.sleep(1500);
						System.out.println("\nYour Otp For the amount "+total_fair+" is: "+Otp);
						System.out.print("Please Enter the otp  ");
						int otp_in=sc.nextInt();
						if(otp_in==Otp)
							{
								System.out.print("Processing...");
								Thread.sleep(1000);
								System.out.println("\nPayment Successfull");
								System.out.println("Ticket Confirmed\n");
								double Seat=Math.random()*32+32;
								int seat_no=(int)Seat;
								for(int a=1,b=seat_no;a<=total_seats;a++,b++)
								{
								System.out.println("Your Seat Number for Passenger "+a+" is "+b+" in S3 Coach");
								}
							}
						}
					}
					else
					{
						System.out.println("Worng Input");
					}
				}
				else
				{
					System.out.println("Worng Input");
				}
			}
			else
			{
				System.out.println("Worng Input");
			}
		}
		else
		{
			System.out.println("Worng Input");
		}
	}
}
