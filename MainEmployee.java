import java.util.Scanner;  
class employee{
       int emp_id;
       char emp_r;
       void get_Detail(int id,char r){

                     emp_id = id;
                     emp_r = r;
             }
       void print(){
              System.out.println(emp_id+" "+emp_r);
             }
}
class MainEmployee{
        public static void main (String[] args){
               int f=0;
               employee e[] = new employee[5];
               for(int i=0;i<5;i++)
                     e[i]=new employee();
               for(int i=0;i<5;i++)
                     
                     e[i].get_Detail(1+f,'A'+f);
                     f++;
               for(int i=0;i<5;i++)
                     e[i].print();
}
}