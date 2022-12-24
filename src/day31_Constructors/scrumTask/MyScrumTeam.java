package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        // 4 testers object
        Tester tester1=new Tester("Muhtar","SDET",123456,150000);
        Tester tester2=new Tester("ADEM","QA",123455,130000);
        Tester tester3=new Tester("ADEM2","QA",123457,130000);
        Tester tester4=new Tester("ADEM3","QA",123458,130000);

        Tester[]testers={tester2,tester3,tester4};

        // 5 developers object

        Developer developer1=new Developer("ASİYE","SDET",123405,120000);
        Developer developer2=new Developer("ASİYE1","SDET",123415,120000);
        Developer developer3=new Developer("ASİYE2","SDET",123425,120000);
        Developer developer4=new Developer("ASİYE3","SDET",123435,120000);
        Developer developer5=new Developer("ASİYE5","SDET",123445,120000);

        Developer[]developers={developer2,developer3,developer4,developer5};

        // 1 scrumTeam Object
        ScrumTeam scrum=new ScrumTeam("NURİSLAM","ÖMERCAN","ABDURRAHMAN",14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        System.out.println("=================");
        for (Tester eachTester:scrum.testersList){
            System.out.println(eachTester.name+":"+eachTester.salary);

        }
        System.out.println("--------------------");
        for (Developer eachDeveloper:scrum.developersList){
            System.out.println(eachDeveloper.name+":"+eachDeveloper.salary);
        }
        System.out.println("*************");
        scrum.removeDeveloper(123405);
        scrum.removeTester(123455);
        System.out.println(scrum);
    }
}
