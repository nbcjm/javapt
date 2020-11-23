helm을 통한 차트 배포 실습

(+rabbitmq dashboard접근)

https://gruuuuu.github.io/cloud/l-helm-basic/#

### helm 설치

~~~bash
$ curl https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3 > get_helm.sh
$ chmod 700 get_helm.sh
~~~

이후 helm version을 입력해 설치가 잘 되었는지 확인

helm을 통해 차트를 배포하려면 우선 repository를 추가해야 한다.

helm repo add 'namespace' 'repository link'

이후 helm repo update를 통해 저장소를 업데이트한다.



### helm 을 통한 차트 배포(패키지 설치)

helm install 'release-name' 'chartname' 을 통해 차트를 'release-name'으로 릴리즈된다.



StroageClass는 default StorageClass로 설정되어있음

helm을 통해 배포한 svc type를 NodePort로 변경한다(kubectl edit svc ~~/dashboard에 접근해서 대상 svc의 type를 NodePort로 변경)

이후 nodeip:15672 로 접근

<img src="C:\Users\cjm\AppData\Roaming\Typora\typora-user-images\image-20201123114801923.png" alt="image-20201123114801923"  />