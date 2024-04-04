# Java 기초 실습
> [PDA 3기] 백엔드 기초(Java) 프로그래밍 수업
## 미니 과제 01
- `경로` src > day2 > MiniTask01.java
- `객체`는 다음과 같이 설계
  - Phone
    - SamsungPhone
    - ApplePhone
  - Person
  - Store
- `기능` or `관계`
  - Store 객체가 Phone 객체 사용
    - 가게가 보유하고 있는 휴대폰 종류를 저장하기 위해 사용
  - Person 객체가 Phone 객체 사용
    - 본인이 소유하고 있는 Phone을 저장하기 위해 사용
  - Person이 Phone을 구입할 때, Store에 해당 Phone이 있는 경우 구입이 가능하게 구현