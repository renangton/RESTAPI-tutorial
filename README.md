# 概要
このプロジェクトは

# 前提
- Java 11
- Spring Boot 2.6.3

# Getting Started
`$ git clone https://github.com/renangton/RESTAPI-tutorial.git`

`$ cd RESTAPI-tutorial`

`$ ./gradlew bootRun`

起動成功時のイメージ

![RESTAPI](https://user-images.githubusercontent.com/97335620/159173128-4265d25f-31e8-410a-b059-495969d8e955.png)

`http://localhost:8080/greeting`にアクセスすると`{"id":1,"content":"Hello, World!"}`が表示される

- ブラウザで更新をかけるとidの値が１ずつ増加する

`http://localhost:8080/greeting?name=hoge`アクセスすると`{"id":1,"content":"Hello, hoge!"}`が表示される

- hogeの部分には任意の値が入力可能
- ブラウザで更新をかけるとidの値が１ずつ増加する

（`./gradlew bootRun`コマンドで実行している場合）`ctrl + c`で終了する
