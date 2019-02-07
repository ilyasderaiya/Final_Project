package com.lambton;

public class Payroll {

    public static void main(String[] args) {
        FullTime ft1 = new FullTime("ilyas", "deraiya", 23, "Mississauga", 10000, 200, new Car("Honda", "PJY5647", "Accord", 4));
        FullTime ft2 = new FullTime("ayub", "ali", 23, "Scarborough", 5000, 20, null);
        CommissionBasedPartTime cbpt1 = new CommissionBasedPartTime("Ronak", "patel", 25, "Hamilton",14, 40, 10,new Motorcycle("Suzuki", "GJ05AS0012","GSX", "Blue"));
        FixedBasedPartTime fbpt1 = new FixedBasedPartTime("vidhi", "desai",24,"Montreal",17, 54, 200,null);
        Intern in1 = new Intern("shivani", "bulsara", 23, "Brampton", "Seneca", 1000, null);
        Intern in2 = new Intern("abhishek", "trivedi", -2, "Brampton", "Seneca", 1200, null);

        IPrintable[] employees = new IPrintable[100];
        employees[0] = ft1;
        employees[1] = ft2;
        employees[2] = cbpt1;
        employees[3] = fbpt1;
        employees[4] = in1;
        employees[5] = in2;

        for (IPrintable p : employees) {


            if (p instanceof FullTime) {
                FullTime ft = (FullTime) p;
                System.out.printf(ft.printMyData());
            }
            else if(p instanceof Intern){
                Intern in = (Intern) p;
                System.out.println(in.printMyData());
            }
            else if(p instanceof CommissionBasedPartTime){
                CommissionBasedPartTime cbpt = (CommissionBasedPartTime) p;
                System.out.println(cbpt.printMyData());
            }
            else if(p instanceof FixedBasedPartTime){
                FixedBasedPartTime fbpt = (FixedBasedPartTime) p;
                System.out.println(fbpt.printMyData());
            }

        }


    }


}
