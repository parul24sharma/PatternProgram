import java.util.Scanner;
import pattern.*;
class PatternProgram{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		boolean valid = true;//main program loop valid
		String status; // status for entering more sizes
		int action = 4;//which shape is to draw
		while(valid){
			System.out.println("\n\n\t**DRAWING SHAPES**\n");
			System.out.println("Enter Consecutive no. for different actions");
			System.out.println("\t1) Numbers\n");
			System.out.println("\t2) Shapes\n");
			System.out.println("\t3) Pattern\n");
			System.out.println("\t4) Exit\n");
			try{
				action = in.nextInt();
			}catch(Exception e){
				System.out.println("Invalid Input! Error:"+e);
			}
			switch(action){
				case 1:
					pattern.NumberPattern nobj = new pattern.NumberPattern();
					status = "Yes";
					while(status.equalsIgnoreCase("Yes") || status.equalsIgnoreCase("Y")){
						try{
							System.out.println("\t---- Printing Numbers ----");
							System.out.println("\tEnter Number to Print");
							int n = in.nextInt();
							if(n>=0 && n<=9){
								nobj.number(n);
							}
							else{
								System.out.println("Number should be in between 0 to 9 only\n");
							}
							System.out.println("\tWant to Enter another number : Yes / No\n");
							status = in.next();
						}catch(Exception e){
							System.out.println("Invalid Input! Error:"+ e);
						}
					}
					break;
				case 2:
					pattern.ShapePattern ob = new pattern.ShapePattern();
					boolean shape = true;
					int size;
					while(shape){
						System.out.println("\t---- Printing Shapes ----");
						System.out.println("\tChoose Shape to Print");
						System.out.println("\n\t1) Diamond");
						System.out.println("\t2)Arrow");
						System.out.println("\t3)House");
						System.out.println("\t4)Computer");
						System.out.println("\t5)Exit Shape");
						int shapeAct = in.nextInt();
						switch(shapeAct){
							case 1:
								status = "Yes";
								while(status.equalsIgnoreCase("Yes")||status.equalsIgnoreCase("Y")){
									try{
										System.out.println("\tEnter Size of Diamond");
										size = in.nextInt();
										ob.diamond(size);
										System.out.println("\tWant to enter more sizes?? : Yes / No");
										status = in.next();
									}catch(Exception e){
										System.out.println("Invalid Input! Error:"+ e);
									}
								}
								break;
							case 2:
								status = "Yes";
								while(status.equalsIgnoreCase("Yes")||status.equalsIgnoreCase("Y")){
									try{
										System.out.println("\tEnter Size of Arrow");
										size = in.nextInt();
										ob.arrow(size);
										System.out.println();
										System.out.println("\tWant to enter more sizes?? : Yes / No");
										status = in.next();
									}catch(Exception e){
										System.out.println("Invalid Input! Error:"+ e);
									}
								}
								break;
							case 3:
								ob.house(7);
								break;
							case 4:
								status = "Yes";
								while(status.equalsIgnoreCase("Yes") || status.equalsIgnoreCase("Y")){
									System.out.println("Enter size of Computer");
									try{
										size = in.nextInt();
										if(size>10){
											ob.computer(size);
										}
										else{
											System.out.println("Sorry! This size is too Small");
											System.out.println("Size Hint : 32(as in 32 inches screen)");
											continue;
										}
										try{
											System.out.println("Want to Enter more Sizes?? Yes or No");
											status = in.next();
										}catch(Exception e){//if enterd status is invalid
											System.out.println("Invalid Input! Error:"+ e);
										}
									}catch(Exception e){//if entered size is invalid
										System.out.println("Invalid Input! Error:"+ e);
									}
								}
								break;
							case 5:
								shape = false;
								break;
							default:
								System.out.println("This is not an Option");
						}
						System.out.println();
					}
					break;
				case 3:
					pattern.TrianglePattern tobj = new pattern.TrianglePattern();
					boolean pattern = true;
					while(pattern){
						System.out.println("\t---- Printing Triangle Patterns ----");
						System.out.println("\tChoose any Triangle Pattern");
						System.out.println("\n\t1) Odd Triangle");
						System.out.println("\t2) Even Triangle");
						System.out.println("\t3) Number Triangle");
						System.out.println("\t4) Pascal Triangle");
						System.out.println("\t5) Exit Shape");
						int patternAct = in.nextInt();
						switch(patternAct){
							case 1:
								tobj.oddTriangle(5);	//only single digit size alowed
								break;
							case 2:
								tobj.evenTriangle(5);
								break;
							case 3:
								tobj.noTriangle(7);
								break;
							case 4:
								tobj.pascalTriangle(7);
								break;
							case 5:
								pattern = false;
								break;
							default:
								System.out.println("This is not an Option");
						}
						System.out.println();
					}
					break;
				case 4:
					valid = false;
					break;
				default:
					System.out.println("Input is not Defined");
			}//switch end
		}//end of while
	}//main end
}//class end
