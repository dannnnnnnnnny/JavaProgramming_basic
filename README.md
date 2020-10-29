# JavaProgramming_basic
java_basic practice

# Java의 동작 원리


.java (Java Source Code)
=> 1) Compile =>
.class (Java Application)
=> 2) Run =>
Java Virtual Machine
=> 3) Run =>
Computer

.java 파일을 compile하면 .class 파일이 생성됩니다. (보이지는 않음)
.class 파일은 JVM 을 통해서 실행시킬 수 있습니다.


- 자바의 클래스는 서로 연관된 변수와 메소드로 구성되어 있음.

- e.g. PrintWriter
- 인스턴스는 각자의 상태를 가지고 있음.
- new를 통해 각각의 내부 상태를 지니는 인스턴스를 생성하여 사용
- 1회성의 작업인 경우는 인스턴스를 생성하지 않고 그대로 사용함.   (e.g. Math 클래스(Math.PI, Math.floor(1.6)...))
- 1회성 클래스는 Constructor(생성자)가 없음
- PrintWriter의 경우 Constructor가 존재하고 이를 통해 인스턴스를 만드는 것이 허용되어 있다고 할 수 있음

# 상속 (Inheritance)
- java.io.PrintWriter는 java.io.Writer를 상속받고 있으며 Writer는 java.lang.Object를 상속받고 있음. (부모, 자식)
- 부모의 변수, 메소드를 그대로 물려받으면서 자신의 메소드, 변수를 추가하여 만듦
- 부모의 메소드를 자식에서 그대로 사용할 수 있는데 이를 override 했다고 함.




