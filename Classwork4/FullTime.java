public class FullTime extends Writer{
    private int salary;
    private boolean bookTour;
    
    public FullTime(String name, boolean pub, int words, String gen, int sal, boolean tour){
        super(name, pub, words, gen);
        salary = sal;
        bookTour = tour;
    }
    
    public void takeRetreat(){
        salary = salary - 250;
    }
    
    public void teachWorkshop(){
        salary = salary + 250;
    }
    
    
    public void hirePublicist(){
        salary = salary -350;
    }
    
    
    
    public String toString(){
        return super.toString() + ". Salary: " + salary + ". Book Tour? " + bookTour;
    
    }
}