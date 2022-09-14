package observer;

class View1 implements Observer {
    private Student student;

    public View1(Student s) {
        this.student = s;
    }

    public void update() {
        System.out.println("View1:" + student.getId() +" "+ student.getName());
    }
}

class View2 implements Observer {
    private Student student;

    public View2(Student s) {
        this.student = s;
    }

    public void update() {
        System.out.println("View2:" + student.getId() +" "+ student.getBirth());
    }
}

class View3 {
    private Student student;

    public View3(Student s) {
        this.student = s;
    }

    public void changeStudent() {
        // change the student
        student.setId(3424);
    }
}
