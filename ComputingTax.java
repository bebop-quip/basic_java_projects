import java.util.Scanner;
public class ComputingTax{
public static void main(String[] args){
	java.util.Scanner input = new java.util.Scanner(System.in);
//filing status
System.out.print("0-Single, 1-Married Jointly, 2-Married Separated, 3-Head of houshold");

//prompt user to enter filing status
System.out.println("Enter filing status: ");
int status = input.nextInt();

//prompt user to enter taxable income
System.out.print("Enter taxable income: ");
double income = input.nextDouble();
double tax = 0;

//compute tax status for single
if (status == 0){
	//10%
if (income <= 8350){
	tax += income * .1;
	}
	//15%
if (income >= 8351 && income <=33950){
	tax = 835 + (income - 8350) * .15;
	}
	//25%
if (income >=33951 && income <=82250){
	tax = 835 + 3840 + (income - 33950) * .25;
	}
	//28%
if (income >=82251 && income <=171550){
	tax = 835 + 3840 + 12075 + (income - 82250) * .28;
	}
	//33%
if (income >=171551 && income <=372950){
	tax = 835 + 3840 + 12075 + 25004 +(income - 171550) * .33;
	}
	//35%
if (income >= 372951){
	tax = 835 + 3840 + 12075 + 25004 + 66462 +(income - 372950) * .35;
	}
}

//status for married joint
if (status == 1){
	//10%
if (income <= 16700){
	tax += income * .1;
	}
	//15%
if (income >= 16701 && income <=67900){
	tax = 1670 + (income - 16700) * .15;
	}
	//25%
if (income >=67901 && income <=137050){
	tax = 1670 + 7680 + (income - 67900) * .25;
	}
	//28%
if (income >=137051 && income <=208850){
	tax = 1670 + 7680 + 17287.5 + (income - 137050) * .28;
	}
	//33%
if (income >=208851 && income <=372950){
	tax = 1670 + 7680 + 17287.5 + 20104 +(income - 208850) * .33;
	}
	//35%
if (income >= 372951){
	tax = 1670 + 7680 + 17287.5 + 20104 + 54153 +(income - 372950) * .35;
	}
}

//status for married separate
if (status == 2){
	//10%
if (income <= 8350){
	tax += income * .1;
	}
	//15%
if (income >= 8351 && income <=33950){
	tax = 835 + (income - 8350) * .15;
	}
	//25%
if (income >=33950 && income <=68525){
	tax = 835 + 3840 + (income - 33950) * .25;
	}
	//28%
if (income >=68525 && income <=104425){
	tax = 835 + 3840 + 8643.75 + (income - 68525) * .28;
	}
	//33%
if (income >=104426 && income <=186475){
	tax = 835 + 3840 + 8643.75 + 10052 +(income - 104425) * .33;
	}
	//35%
if (income >= 186476){
	tax = 835 + 3840 + 8643.75 + 10052 + 27076.5 +(income - 186475) * .35;
	}
}

//status for head of household
if (status == 3){
	//10%
if (income <= 11950){
	tax += income * .1;
	}
	//15%
if (income >= 11951 && income <=45500){
	tax = 1195 + (income - 11950) * .15;
	}
	//25%
if (income >=45501 && income <=117450){
	tax = 1195 + 5032.5 + (income - 45500) * .25;
	}
	//28%
if (income >=117451 && income <=190200){
	tax = 1195 + 5032.5 + 17987.5 + (income - 117450) * .28;
	}
	//33%
if (income >=190201 && income <=372950){
	tax = 1195 + 5032.5 + 17987.5 + 20370 +(income - 190200) * .33;
	}
	//35%
if (income >= 372951){
	tax = 1195 + 5032.5 + 17987.5 + 20370 + 60307.5 +(income - 372950) * .35;
	}
}

//print output for tax
System.out.print("Your Tax is: " + tax);
}
}