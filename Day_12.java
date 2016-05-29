// Day 12: Inheritance

class Student extends Person{
	private int[] testScores;
    
    Student(String firstName, String lastName, int identification, int[] scores){
    super(firstName, lastName, identification);
    this.testScores = scores;
}

public char calculate(){

    int sum = 0;
    double avg;
    char result='T';
    for(int i = 0; i < testScores.length; i++){
        sum = sum + testScores[i];
    }
    avg = sum / testScores.length;
    //System.out.println((int)avg);
    int avgi = (int) avg;
     if(avgi >=90){
            result = 'O';
        }
     else if(avgi >=80){
            result = 'E';
        }
     else if(avgi >=70){
            result = 'A';
        }
     else if(avgi >=55){
            result = 'P';
        }
     else if(avgi >=40){
            result = 'D';
        }
     else{
            result = 'T';
        }
    return result;
}
}
   

