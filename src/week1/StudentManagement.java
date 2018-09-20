package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
Student[] st = new Student[100];
	
    public boolean sameGroup(Student s1, Student s2) {
        // TODO: 
		if(s1.getGroups()==s2.getGroups()) return true;
		else return false;
    }
	int number(){
		int i=0;
		while(st[i]!=null) i++;
		return i;
	}	
    void studentsByGroup() {
         //TODO:
		 Student b = new Student();
		 String Lop=st[0].getGroups();
		 for(int i =0;i<number();i++){
			 
		 for(int j =i+1;j<number();j++){
			 if(st[i].getGroups().equals(st[j].getGroups())) {
				 b=st[i];
				 st[i]=st[j];
				 st[j]=b;
			 } 
		 }  
		 }
		System.out.println(Lop);
		 for(int i=0;i<number();i++){
		 if(st[i].getGroups().equals(Lop)) st[i].getInfo();
		 else {
			 Lop = st[i].getGroups();
			 System.out.println(Lop);
			 
		 i--;
		 }
	} 
    }

    void removeStudent(String id) {
         //TODO:
		 for(int i=0; i<number(); i++)
        {

            if(id.equals(st[i].getId()))
            {
              for(int j=i; j<number(); j++)
              {
                st[j] = st[j + 1];
              }
            }
        }
		System.out.println("Danh sach lop sau khi xoa: ");
		for(int i=0;i<number();i++) st[i].getInfo();
	}

    public static void main(String[] args) {
        // TODO:
		
		Student s = new Student();
		s.setName("Vo Hong Long");
		s.setId("17020870");
		s.setGroups("INT22041");
		s.setEmai("hdragon200399@gmail.com");
		System.out.println("Vo Hong Long");
		s.getInfo();
		Student s1 = new Student();
		s1.setName("Vo Hong Long 1");
		s1.setId("1");
		s1.setGroups("INT22041");
		s1.setEmai("hdragon200399@gmail.com");
		Student s2 = new Student();
		s2.setName("Vo Hong Long 2");
		s2.setId("2");
		s2.setGroups("INT22041");
		s2.setEmai("hdragon200399@gmail.com");
		Student s3 = new Student();
		s3.setName("Vo Hong Long 3");
		s3.setId("3");
		s3.setGroups("INT22042");
		s3.setEmai("hdragon200399@gmail.com");
		StudentManagement a = new StudentManagement();
		if (a.sameGroup(s1,s2)==true) System.out.println("Sv 1 va` Sv 2 cung` lop'"); else System.out.println("Sv 1 va` Sv 2 ko cung` lop'");
		if (a.sameGroup(s1,s3)==true) System.out.println("Sv 1 va` Sv 3 cung` lop'"); else System.out.println("Sv 1 va` Sv 3 ko cung` lop'");
		a.st[0]=s;
		a.st[1]=s1;
		a.st[2]=s2;
		a.st[3]=s3;
		a.studentsByGroup();
		a.removeStudent("3");
	}
}