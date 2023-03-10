# Тестовое задание
- - -
Этот проект предоставляет шлюз API, построенный на 
основе экосистемы Spring, в том числе Spring Boot 3. Spring Cloud Gateway стремится предоставить простой, 
но эффективный способ маршрутизации к API и предоставления им комплексных 
функций, таких как: безопасность, мониторинг/метрики и отказоустойчивость.

## Особенности
- - -
* Java 17
* Spring Framework 6
* Spring Boot 3
* Динамическая маршрутизация
* Сопоставление маршрутов, встроенное в Spring Handler Mapping
* Сопоставление маршрута в HTTP-запросе (путь, метод, заголовок, хост и т. д.)
* Фильтры, относящиеся к соответствующему маршруту
* Фильтры могут изменять нисходящие HTTP-запросы и HTTP-ответы 
(добавлять/удалять заголовки, добавлять/удалять параметры, переписывать путь, устанавливать путь, 
Hystrix и т. д. )
* API или конфигурация

## Сборка и запуск
- - -
Для сборки исходного кода вам необходимо установить JDK 17.
Также необходимо самостоятельно установить Maven (>=3.3.3) и Docker.
Для сборки проекта необходимо выполнить команду:

```
mvn install
```

Для сборки образов docker контайнера необходимо выполнить команду:
```
docker compose build
```
Для запуска проекта, выполним команду:
```
docker compose build
```
## Список стандартных API
- - -
#### 1. Обращение к Eureka серверу
Для обращения к серверу Eureka:
```
http://localhost:8080
```

#### 2. Шлюз (Api Gateway)
Адрес доступа к микросервисам обеспечивает шлюз, расположенные по адресу:
```
http://localhost:8081
```

#### 3. Отправка уведомлений микросервисами
Адрес доступа к микросервисам обеспечивает шлюз, расположенный по адресу, 
именно он маршрутизирует пути до конкрентного микросервиса :
```
http://localhost:8081
```
Доступ к микросервисам отправки уведомлений, можно осуществить обратившись
по адресу
```
http://localhost:8081/[$path]/notification
```
, где `$path` значение доступа к конкретному микросервису:
1. Уведомления на телефон $path=`phone`
2. Уведомления на email $path=`email`
3. Push уведомления $path=`push`
- - -
Пример:
```
http://localhost:8081/phone/notification
```








