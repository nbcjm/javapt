#

### Helm

Helm은 kubernetes package managing tool이다.(쿠버네티스 패키지 배포를 가능하게 해주는 tool)

helm은 chart라는 패키지 포멧을 사용한다.

chart는 쿠버네티스 리소스에 관련된 설정들을 묘사하는 파일들의 집합이다.

https://gruuuuu.github.io/cloud/l-helm-basic/#

![image-20201119165538592](C:\Users\cjm\AppData\Roaming\Typora\typora-user-images\image-20201119165538592.png)

(Helm을 이용해 이벤트 모니터링툴인 Prometheus를 배포함)



### RabbitMQ

RabbitMQ는 AMQP(https://ko.wikipedia.org/wiki/AMQP)를 구현한 오픈 소스 메세지 브로커(https://ko.wikipedia.org/wiki/%EB%A9%94%EC%8B%9C%EC%A7%80_%EB%B8%8C%EB%A1%9C%EC%BB%A4)이다.

기본적으로 생산자가 메세지를 큐에 저장해두면 소비자가 메세지를 가져와 처리하는 Publish/Subscribe 방식을 사용한다.
(소비자가 메세지를 조회하면 큐에서 사라짐)

![No Image](https://nesoy.github.io/assets/posts/20190214/1.png)

![No Image](https://nesoy.github.io/assets/posts/20190214/2.png)

메세지는 바로 큐로 가지 않고 Exchange를 거쳐 Binding이라는 규칙에 따라 연결된 큐로 메세지가 복사된다.

![No Image](https://nesoy.github.io/assets/posts/20190214/5.png)

**Exchange Type**(설정)은 다음과 같은 속성을 같는다.

* Name

* Type(메세지 전달 방식)

  * Direct Exchange
    메세지의 라우팅 키와 일치하는 Binding 된 큐로 메세지 전달
    ![img](https://www.rabbitmq.com/img/tutorials/direct-exchange.png)
  * Fanout Exchange
    Binding 되어있는 모든 큐에 메시지 전달
  * Topic Exchange
    라우팅 패턴을 통해 전체/일부 패턴이 일치하는 큐들로 메세지 전달
    ![img](https://www.rabbitmq.com/img/tutorials/python-five.png)

  * Headers Exchange
    Binding key를 무시하고 헤더값이 바인딩시 Binding시 지정된 값과 같은 경우 전달(잘몰것음)

* 
  Durability(브로커가 재시작 될 때 남아있는지 여부(durable(재시작해도 유지 가능),transient(재시작 시 사라짐)))

* Auto-delete(마지막 큐 연결이 해제되면 삭제)