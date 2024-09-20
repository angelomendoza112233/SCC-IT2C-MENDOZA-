
package javaapplication3;

public class grade {
    
    int id;
    String name;
    double p, m, pf, f;
    
    
     public int removeBook(grade[] gn, int size, int id) {
    for (int i = 0; i < size; i++) {
        if (gn[i].id == id) {
            System.out.printf("\nRemoving book with ID: %d\n", id);
            for (int x = i; x < size - 1; x++) {
            gn[x] = gn[x + 1];
            }
            System.out.println("Book removed successfully.");
            return size - 1;
        }
    }
        return 0;
     }
     
    public void addGrades(int sid, String sname, double sp, double sm, double spf, double sf) {
        this.id = sid;
        this.name = sname;
        this.p = sp;
        this.m = sm;
        this.pf = spf;
        this.f = sf;
    }
    
    public void viewGrade() {
        double average = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s%n",
                this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
    }

    
    }


    
    
