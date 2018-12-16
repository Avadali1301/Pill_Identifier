import java.util.*;
public class Real_Pills extends Pill {
//The pills that I created are here
//Pill_Count = 24 pills
static Pill phenobarbital = new Pill();
static Pill mebaral = new Pill();
static Pill seconal1 = new Pill();
static Pill seconal2 = new Pill();
static Pill nembutal = new Pill();
static Pill valium1 = new Pill();
static Pill valium2 = new Pill();
static Pill oxycontin1 = new Pill();
static Pill oxycontin2 = new Pill();
static Pill oxycontin3 = new Pill();
static Pill oxycontin4 = new Pill();
static Pill oxycontin5 = new Pill();
static Pill xanax1 = new Pill();
static Pill xanax2 = new Pill();
static Pill xanax3 = new Pill();
static Pill xanax4 = new Pill();
static Pill ambien1 = new Pill();
static Pill ambien2 = new Pill();
static Pill sonata = new Pill();
static Pill lunesta1 = new Pill();
static Pill lunesta2 = new Pill();
static Pill adderall1 = new Pill();
static Pill adderall2 = new Pill();
static Pill adderall3 = new Pill();
static Pill adderall4 = new Pill();
static Pill adderall5 = new Pill();
//Where the pills will be stored
static ArrayList<Pill> pill_list = new ArrayList<>();
//How I will get user input
static Scanner sc = new Scanner(System.in);
//Where I will store user input
static boolean isPill = false;
//Helps form my else statement if the user pill is not in my list
static Pill userPill = new Pill();
public static void main(String[] args) {
//*************************************************************************
								phenobarbital.color = "white";
								phenobarbital.shape = "circle";
								phenobarbital.side1 = "ww 458";
								phenobarbital.name = "phenobarbital";
								pill_list.add(phenobarbital);
//*************************************************************************
								mebaral.color = "white";
								mebaral.side1 = "m 31";
								mebaral.shape = "circle";
								mebaral.name = "mebaral";
								pill_list.add(mebaral);
//**************************************************************************
								seconal1.color = "red";
								seconal1.side1 = "rx679";
								seconal1.shape = "capsule";
								seconal1.name = "seconal";
								pill_list.add(seconal1);
//**************************************************************************
								seconal2.color = "orange";
								seconal2.side1 = "lilly f40";
								seconal2.shape = "capsule";
								seconal2.name = "seconal";
								pill_list.add(seconal2);
//**************************************************************************
								nembutal.color = "yellow";
								nembutal.side1 = "ch";
								nembutal.shape = "capsule";
								nembutal.name = "nembutal";
								pill_list.add(nembutal);
//**************************************************************************
								valium1.color = "yellow";
								valium1.side1 = "valium";
								valium1.side2 = "roche roche";
								valium1.shape = "circle";
								valium1.name = "valium";
								pill_list.add(valium1);
//**************************************************************************
								valium2.color = "blue";
								valium2.side1 = "valium";
								valium2.side2 = "roche roche";
								valium2.shape = "circle";
								valium2.name = "valium";
								pill_list.add(valium2);
//**************************************************************************
								oxycontin1.color = "white";
								oxycontin1.side1 = "10";
								oxycontin1.side2 = "oc";
								oxycontin1.shape = "circle";
								oxycontin1.name = "oxycontin";
								pill_list.add(oxycontin1);
//**************************************************************************
								oxycontin2.color = "pink";
								oxycontin2.side1 = "20";
								oxycontin2.side2 = "oc";
								oxycontin2.shape = "circle";
								oxycontin2.name = "oxycontin";
								pill_list.add(oxycontin2);
//**************************************************************************
								oxycontin3.color = "yellow";
								oxycontin3.side1 = "40";
								oxycontin3.side2 = "oc";
								oxycontin3.shape = "circle";
								oxycontin2.name = "oxycontin";
								pill_list.add(oxycontin3);
//**************************************************************************
								oxycontin4.color = "green";
								oxycontin4.side1 = "80";
								oxycontin4.side2 = "oc";
								oxycontin4.shape = "circle";
								oxycontin4.name = "oxycontin";
								pill_list.add(oxycontin4);
//**************************************************************************
								oxycontin5.color = "blue";
								oxycontin5.side1 = "160";
								oxycontin5.side2 = "oc";
								oxycontin5.shape = "oval";
								oxycontin5.name = "oxycontin";
								pill_list.add(oxycontin5);
//**************************************************************************
								xanax1.color = "blue";
								xanax1.side1 = "xanax 1.0";
								xanax1.shape = "oval";
								xanax1.name = "xanax";
								pill_list.add(xanax1);
//**************************************************************************
								xanax2.color = "white";
								xanax2.side1 = "xanax 0.25";
								xanax2.shape = "oval";
								xanax2.name = "xanax";
								pill_list.add(xanax2);
//**************************************************************************
								xanax3.color = "orange";
								xanax3.side1 = "xanax 0.5";
								xanax3.shape = "oval";
								xanax3.name = "xanax";
								pill_list.add(xanax3);
//**************************************************************************
								xanax4.color = "white";
								xanax4.side1 = "x ana x";
								xanax4.side2 = "2";
								xanax4.shape = "rectangle";
								xanax4.name = "xanax";
								pill_list.add(xanax4);
//**************************************************************************
								ambien1.color = "red";
								ambien1.side1 = "amb 5";
								ambien1.side2 = "5401";
								ambien1.shape = "oval";
								ambien1.name = "ambien";
								pill_list.add(ambien1);
//**************************************************************************
								ambien2.color = "white";
								ambien2.side1 = "amb 10";
								ambien2.side2 = "5421";
								ambien2.shape = "oval";
								ambien2.name = "ambien";
								pill_list.add(ambien2);
//**************************************************************************
								sonata.color = "turquoise";
								sonata.side1 = "10mg";
								sonata.side2 = "sonata";
								sonata.shape = "capsule";
								sonata.name = "sonata";
								pill_list.add(sonata);
//**************************************************************************
								lunesta1.color = "blue";
								lunesta1.side1 = "s193";
								lunesta1.shape = "circle";
								lunesta1.name = "lunesta";
								pill_list.add(lunesta1);
//**************************************************************************
								lunesta2.color = "blue";
								lunesta2.side1 = "s190";
								lunesta2.shape = "circle";
								lunesta2.name = "lunesta";
								pill_list.add(lunesta2);
//**************************************************************************
								adderall1.color = "blue";
								adderall1.shape = "circle";
								adderall1.side1 = "1 0";
								adderall1.side2 = "ad";
								adderall1.name = "adderall";
								pill_list.add(adderall1);
//**************************************************************************
								adderall2.color = "orange";
								adderall2.side1 = "dp";
								adderall2.side2 = "1 5";
								adderall2.shape = "oval";
								adderall2.name = "adderall";
								pill_list.add(adderall2);
//**************************************************************************
								adderall3.color = "orange";
								adderall3.side1 = "3 0";
								adderall3.side2 = "ad";
								adderall3.shape = "circle";
								adderall3.name = "adderall";
								pill_list.add(adderall3);
//**************************************************************************
								adderall4.color = "blue";
								adderall4.side1 = "adderall xr";
								adderall4.side2 = "10mg";
								adderall4.shape = "capsule";
								adderall4.name = "adderall";
								pill_list.add(adderall4);
//**************************************************************************
								adderall5.color = "orange";
								adderall5.side1 = "a d";
								adderall5.side2 = "15";
								adderall5.shape = "oval";
								adderall5.name = "adderall";
								pill_list.add(adderall5);
//**************************************************************************
								//I ask the user the shape of their pill
								System.out.println("What is the shape of your pill(circle, oval, rectangle, capsule): ");
								//I collect the pill shape
								String userShape = sc.nextLine().trim().toLowerCase();
								//I store the pill shape and remove excess whitespace and transform it to lower case
								userPill.shape = userShape;
								//I ask the user the color of their pill
								System.out.println("What color is your pill: ");
								//I collect the pill color
								String userColor = sc.nextLine().trim().toLowerCase();
								//I store the pill color and remove excess whitespace and transform it to lower case
								userPill.color = userColor;
								//I ask the user what is on the first side of their pill
								System.out.println("What does it say on one side of your pill (If symbols are not adjacent, put a space between them): ");
								//I collect the pill side1
								String userSide1 = sc.nextLine().trim().toLowerCase();
								//I store the pill side1 and remove excess whitespace and transform it to lower case
								userPill.side1 = userSide1;
								//I ask the user what is on the second side of their pill
								System.out.println("What does it say on the other side of your pill If symbols are not adjacent, put a space between them): ");
								//I collect the pill side2
								String userSide2 = sc.nextLine().trim().toLowerCase();
								//I store the pill side1 and remove excess whitespace and transform it to lower case
								userPill.side2 = userSide2;
								//I close my scanner
								sc.close();
								/*This loop will iterate through the list of pills and check if the imprint of the user pill equals any
								   of the imprints of the real pills */
								for(int i = 0; i < pill_list.size(); i++) {
																//Checks if the imprints, shape, and color are equal
																if(((userPill.side1.equals(pill_list.get(i).side1) ||
																					userPill.side1.equals(pill_list.get(i).side2) ||
																					userPill.side2.equals(pill_list.get(i).side1) ||
																					userPill.side2.equals(pill_list.get(i).side2)) &&
																				userPill.color.equals(pill_list.get(i).color) &&
																				userPill.shape.equals(pill_list.get(i).shape)) ||
																			((userPill.side1.equals(pill_list.get(i).side1) ||
																					userPill.side1.equals(pill_list.get(i).side2) || userPill.side2.equals(pill_list.get(i).side1) ||
																					userPill.side2.equals(pill_list.get(i).side2)) &&
																				userPill.color.equals(pill_list.get(i).color)) ||
																			((userPill.side1.equals(pill_list.get(i).side1) ||
																					userPill.side1.equals(pill_list.get(i).side2) ||
																					userPill.side2.equals(pill_list.get(i).side1) ||
																					userPill.side2.equals(pill_list.get(i).side2)) &&
																				userPill.shape.equals(pill_list.get(i).shape)) ||
																			(userPill.side1.equals(pill_list.get(i).side1) ||
																				userPill.side1.equals(pill_list.get(i).side2) ||
																				userPill.side2.equals(pill_list.get(i).side1) ||
																				userPill.side2.equals(pill_list.get(i).side2))) {
																								//Prints the pill to the console
																								System.out.println(pill_list.get(i).toString());
																								//Once I find the right pill I need to exit the loop
																								break;
																}
								}
}
}
