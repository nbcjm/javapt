https://wikidocs.net/224

https://gmlwjd9405.github.io/2018/06/03/agile-tdd.html

# TDD(test-driven development)

**테스트 주도 개발**

먼저 테스트 코드를 만든 후 그에 맞춰 원하는 결과가 나오도록 코드를 짜고, 이를 반복해 코드를 완성하는 방식

#### TDD를 하는 이유

TDD는 Simple code 를 목적으로 이루어진다.

TDD를 하면 다음과 같은 이점을 얻는다.

* 피드백이 증가함으로 잘 되어가고 있는가를 확인할 수 있다.
* 테스트 코드를 통해 다른 사람들이 코드를 쉽게 이해 할 수 있다.(협력 증진)

**Junit**

자바를 위한 단위 테스트 작성을 위한 산업 표준 프레임워크다.

## 부록1(Code Coverage)(작성중)

https://educoder.tistory.com/entry/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4-%EA%B3%B5%ED%95%99-Code-Coverage%EB%9E%80-%EB%AC%B4%EC%97%87%EC%9D%B8%EA%B0%80

Test Code Coverage, Code Coverage 등 다양한 이름으로 불리기도 한다.

Code Coverage는 작성된 소스 코드가 얼마나 실행 되었는지를 지표로 나타낸것이다.

* Function coverage

  * Function coverage는 어떤 function이 최소한 한 번은 실행되었는 가를 측정한다.
  * Function call을 했는지만을 확인하기 때문에 function 안의 모든 코드가 실행되었는가는 확인할 수 없다.

* Statement coverage

  * Statement coverage는 각 statement가 실행되었는 지를 측정한다.
    즉 각 라인이 실행가능한 statement라면 해당 라인이 실행되었는가를 확인한다.

  * (+) object code에 바로 적용이 될 수 있다.

  * (-) 특정 조건분기문에서 에러를 찾아내지 못 할 가능성이 있다.
    아래 코드에서 condition이 false 가 될 경우 null pointer error(null object를 사용하려고 할 경우 발생) 가 나고, 이런 경우 statement coverage를 사용하여 해당 부분을 테스트 할 경우 coverage가 달성 되었다고 하지만,모든 경우를 test 했다고 보장 할 수 없다.

    ~~~c++
    int *p = NULL;
    if(condition)
       p = &a;
    *p = 123;
    ~~~

* Branch coverage

  * Brarnch coverage는 조건 분기문이 참/거짓으로 모두 실행되었는지를 측정한다.

