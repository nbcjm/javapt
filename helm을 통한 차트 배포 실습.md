helm을 통한 차트 배포 실습

(+rabbitmq dashboard접근)

https://gruuuuu.github.io/cloud/l-helm-basic/#

StroageClass는 default StorageClass로 설정되어있음

helm을 통해 배포한 svc type를 NodePort로 변경한다(kubectl edit svc ~~/dashboard에 접근해서 대상 svc의 type를 NodePort로 변경)

이후 nodeip:15672 로 접근

<img src="C:\Users\cjm\AppData\Roaming\Typora\typora-user-images\image-20201123114801923.png" alt="image-20201123114801923"  />