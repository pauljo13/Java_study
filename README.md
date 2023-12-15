# Java_study
![Java Logo](https://nesoy.github.io/assets/logo/Java.jpg)  
  
## 자바 기초 - 1일차
객체 지향 프로그래밍 언어인 자바는 강력한 타입 체크를 제공하며, 다양한 데이터 타입을 지원합니다. 이러한 데이터 타입들을 이해하고 올바르게 사용하는 것은 자바 프로그래밍에서 매우 중요합니다.
  
Java 사용 : 웹 애플리케이션, 모바일 App, 데스크톱 App, 웹 자동화, 머신러닝, 데이터 분석, 사물인터넷, 게임 개발, ... 코딩 테스트  
java  배우면 좋을까 : 개발자 취업, 컴퓨터 전공, 웹/모바일 앱 개발
  
#### 자바 타입 시스템의 중요성
자바의 타입 시스템은 프로그램의 안정성과 유지보수성을 향상시킵니다. 컴파일 시에 데이터 타입을 체크함으로써, 런타임 오류의 가능성을 줄여줍니다. 또한, 각 변수의 타입이 명확하게 정의되어 있기 때문에 코드의 가독성이 높아지고, 다른 개발자들이 코드를 이해하고 수정하는 데 도움이 됩니다.

자바는 처음 배우는 사람들에게 타입에 대한 엄격한 이해를 요구하지만, 이는 강력한 프로그래밍 습관을 형성하는 데 도움이 됩니다. 따라서 자바를 배우는 과정에서 다양한 데이터 타입에 익숙해지고, 올바르게 사용하는 방법을 배우는 것이 중요합니다.

  
### 목록(9h)
- 환경 설정
- 자료형과 변수
- 연산자
- 문자열
- 제어문
- 배열
- 메소드

## 자바 기초 - 2일차

#### 기본 데이터 타입
자바의 기본 데이터 타입에는 다음과 같은 종류가 있습니다:
  
1. **문자열(String)과 문자(char)**
   - `String`: 문자열을 저장하며, 긴 텍스트를 다룰 때 사용합니다.
   - `char`: 단일 문자를 저장하며, 작은 따옴표(')로 둘러싸인 단일 문자를 표현합니다.

2. **숫자 데이터 타입**
   - `int`: 일반적인 크기의 정수를 저장합니다. 예: `int age = 30;`
   - `long`: 더 큰 정수를 저장할 때 사용합니다. 예: `long distance = 12345678901L;`
   - `double`: 정밀한 실수를 저장할 때 사용하며, 기본적으로 실수는 `double`로 처리됩니다. 예: `double pi = 3.14159;`
   - `float`: 덜 정밀한 실수를 저장하며, 메모리를 덜 사용합니다. 숫자 뒤에 'f'나 'F'를 붙여 표시합니다. 예: `float height = 5.9f;`

3. **Boolean**
   - `boolean`: `true` 또는 `false` 값을 가집니다. 조건문과 논리 연산에 주로 사용됩니다.
  
  
#### 변수 선언 및 초기화
자바에서 변수를 선언할 때는 데이터 타입을 명시해야 합니다. 변수 선언 후에, 값을 초기화할 수 있습니다. 초기화는 변수 선언 시점에 할 수도 있고, 나중에 할 수도 있습니다.

java 에서는 변수를 설정할 때 해당 "데이터 타입 + 변수이름;"으로 변수를 먼저 설정해준다.  
이후 "=" 로 직접 선언한 곳에서 데이터를 넣어도 되지만 이후 "변수명 = 데이터값;"로 변수를 넣수있다.

```java
int myNumber;      // 변수 선언
myNumber = 10;     // 변수 초기화

String myString = "Hello World"; // 변수 선언 및 초기화 동시에
```
  
## 자바 기초 - 3일차

### 변수 이름 짓는 법
자바에서 변수 이름을 짓는 것은 중요한 작업 중 하나입니다. 변수 이름은 다음과 같은 규칙을 따라야 합니다:

1. **저장할 값에 어울리는 이름**: 변수의 용도를 명확하게 나타내는 이름을 사용해야 합니다. 잘못된 이름은 혼란을 야기할 수 있습니다.
2. **문자, 숫자, 밑줄 사용**: 변수 이름에는 문자(`a-z`, `A-Z`), 숫자(`0-9`), 밑줄(`_`)을 사용할 수 있으나, 공백은 사용할 수 없습니다.
3. **시작 문자**: 변수 이름은 밑줄이나 문자로 시작해야 하며, 숫자로 시작할 수 없습니다.
4. **단어 조합**: 한 단어 또는 두 개 이상의 단어를 연결하여 사용할 수 있습니다.
5. **카멜 케이스 사용**: 첫 단어를 제외한 각 단어의 첫 글자는 대문자로 시작합니다. 예: `myVariable`, `currentSpeed`.
6. **예약어 사용 금지**: `public`, `static`, `void`, `int` 등의 예약어는 변수 이름으로 사용할 수 없습니다.
7. **상수는 대문자로**: 변경되지 않는 상수는 대문자로 표기합니다. 예: `MAX_HEIGHT`.

### 상수
상수는 `final` 키워드를 사용하여 선언합니다. 상수는 한 번 값이 할당되면 그 값을 변경할 수 없습니다.

```java
final int MAX_SPEED = 120;
```

### 형변환
형변환은 하나의 데이터 타입을 다른 데이터 타입으로 변환하는 것입니다. 다양한 형변환 방법이 있습니다:

- 정수형 → 실수형: `(float)변수`, `(double)변수`
- 실수형 → 정수형: `(int)변수`
- 숫자 → 문자열: `String.valueOf(변수)`, `Integer.toString(변수)`, `Double.toString(변수)`
- 문자열 → 숫자: `Integer.parseInt(문자열)`, `Double.parseDouble(문자열)` 

### 산술 연산자
자바에서는 다양한 산술 연산자를 사용할 수 있습니다:

- 일반 연산: `+`, `-`, `*`, `/`, `%`
- 우선 순위 연산: 괄호 `()`를 사용하여 연산 순서를 정할 수 있습니다.
- 변수를 이용한 연산: 변수에 값을 할당하고 연산을 수행할 수 있습니다.

```java
int a = 20;
int b = 10;
int c = a + b;
System.out.println(c); // 30
```

- 증감 연산자: `++`, `--`를 사용하여 값을 1씩 증가시키거나 감소시킵니다. `x++`는 출력 후 증가, `++x`는 증가 후 출력합니다.

자바 프로그래밍에서 이러한 개념들을 이해하고 적절히 사용하는 것은 프로그램의 정확성과 가독성을 높이는 데 중요합니다.


