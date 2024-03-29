# 코틀린이란 무엇이며 왜 필요한가? #


- 코틀린 기본 기능
- 코틀린 언어의 주요 특성
- 코틀린을 활용한 안드로이드와 서버 개발
- 코틀린이 다른 언어보다 나은 점
- 코틀린으로 코드를 작성하고 실행하는 방법

## 코틀린의 특징 ##
- 코틀린은 자바 플랫폼에서 돌아가는 새로운 프로그래밍 언어이다.
- 간결하고 실용적이며 자바코드와의 상호운영성을 중시한다.
  - 자바와 다른점은 코틀린에서는 모든 변수의 타입을 프로그래머가 직접 명시할 필요가 없다. 대부분의 경우 코틀린 컴파일러가 문맥으로부터 변수 타입을 자동으로 유추할 수 있다
  - 코틀린은 nullable type을 지원한다
  - 코틀린의 타입시스템에는 function type이 도입되었다
- 자바와 마찬가지로 정적 타입 지정 언어이다
  - 성능 : 실행시점에 어떤 메소드를 호출할지 알아내는 과정이 필요없으므로 메소드 호출이 더 빠르다
  - 신뢰성 : 컴파일러가 정확성을 검증하기 때문에 실행 시 프로그램이 오류로 중단될 가능성이 작다
  - 유지보수성 : 코드에서 다루는 객체가 어떤 타입인지 알 수 있다
  - 도구지원 : 더 안전하게 리팩토링가능하고 더 정확한 코드 완성 기능 및 IDE의 다른 지원 기능도 더 잘 만들 수 있다


## 함수형 프로그래밍과 객체지향 프로그래밍 ##
### 함수형 프로그래밍 ###
- 함수형 프로그래밍 개념
  - 일급 시민(first-class) 함수 : 함수를 일반 값처럼 다룰 수 있다. 함수를 변수에 담을 수 있고 함수를 인자로 다른 함수에 전달할 수 있다. 함수에서 새로운 함수를 만들어서 반환할 수 있다. 
  - 불변성 : 함수형 프로그래밍에서는 만들어지고나면 내부 상태가 바뀌지 않는 불변 객체를 사용하여 프로그램을 작성한다.
  - 부수효과 없음 : 함수형 프로그래밍에서는 입력이 같으면 항상 출력이 같으며 다른 객체의 상태를 변경하지 않는다. 함수 외부나 다른 바깥 환경과 상호작용하지 않는 순수함수를 사용한다
- 함수형 프로그래밍 장점
  - 간결성
  - 다중 스레드를 사용해도 안전하다. 다중 스레드 프로그램에서는 적절한 동기화 없이 같은 데이터를 여러 스레드가 변경하는 경우 문제가 생긴다.
  - 테스트하기 쉽다.
- 코틀린에서의 함수형 프로그래밍
  - 함수 타입을 지원함에 따라 어떤 함수가 다른 함수를 파라미터로 받거나 함수가 새로운 함수를 반환할 수 있다
  - 람다 식을 지원하여 번거로운 준비 코드를 작성하지 않아도 코드 블록을 쉽게 정의하고 전달할 수 있다
  - 데이터 클래스는 불변 객체(value object)를 간편하게 만들 수 있는 구문을 제공
  - 코틀린 표준 라이브러리는 객체와 컬렉션을 함수형 스타일로 다룰 수 있는 API를 제공한다

## 코틀린 도구 ##
### 코틀린 코드 컴파일 ###
코틀린 파일은 코틀린 컴파일러가, 자바 파일은 자바 컴파일러가 각각 class파일을 만들고 jar파일을 생성한다. 이후 코틀린 런타임 라이브러리로 애플리케이션단으로 넘어간다.


