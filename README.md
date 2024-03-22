# Loose-Coupling

**이 코드에는 싱글톤 패턴이 적용되어 있습니다. 싱글톤 패턴은 클래스에 하나의 인스턴스만을 허용합니다.**
> This code has a singleton pattern. The singleton pattern only allows one instance in the class.

### 싱글톤 패턴 (Singleton Pattern)
공통된 객체를 여러개 생성해서 사용하는 경우에 사용한다.
멀티 쓰레드 환경에서 동기화 처리를 하지 않으면 인스턴스가 2개가 생성될 수 있다. 싱글톤이 필요한 상황이 아니면 사용을 자제하는 것이 좋다.

![image](https://github.com/Mavben/Loose-Coupling/assets/135012722/b2bbb372-b388-473a-b19a-f44bf8ffdc27)

### 단점
- 모듈 간의 결합을 강하게 만들어 의존성이 높아진다.
  - 이 때, 의존성 주입(DI, Dependency Injection)을 통해 모듈 간의 결합을 느슨하게(Loose Coupling) 만들 수 있다.
- 테스트를 수행할 때 미리 생성된 인스턴스를 기반으로 구현하게 되므로 독립적인 인스턴스를 만들기 어렵다.

### Reference
[Singleton Pattern by Refactoring Guru](https://refactoring.guru/design-patterns/singleton)
