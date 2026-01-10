class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String emailAddress;
    private String phoneNumber;
    private String department;

    public Student(int studentId, String studentName, int studentAge, String emailAddress, String phoneNumber, String department){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public void setId(int studentId){
        this.studentId = studentId;
    }

    public void setName(String studentName){
        this.studentName = studentName;
    }

    public void setAge(int studentAge){
        this.studentAge = studentAge;
    }

    public void setEmail(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public int getId(){
        return studentId;
    }

    public String getName(){
        return studentName;
    }

    public int getAge(){
        return studentAge;
    }

    public String getEmail(){
        return emailAddress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getDepartment(){
        return department;
    }

    public void displayStudentRecords(){
        System.out.println("Student ID: " +studentId+
            ", Student Name: " +studentName+
            ", Student Age: " +studentAge+
            ", Student Email Address: " +emailAddress+
            ", Student Phone Number: " +phoneNumber+
            ", Student Department: " +department);
    
    }
}
