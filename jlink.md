### Generowanie customowego JRE

```shell
jlink --module-path app/target/modules --add-modules app --output customjre
```

UWAGA: aby powyższe zadziałało niezbędne jest kilka warunków:
1) wszystkie zależności muszą zostać zrzucone podczas budowania do jednego katalogu (w naszym przypadku `target/modules`) - realizujemy to poprzez pluginy w `pom.xml`
2) zależności nie mogą być modułami automatycznymi (jeżeli jednak są to jedynym ratunkiem jest wygenerowanie dla nich plików `module-info.java` za pomocą narzędzia `moditect` - ale to straszna manufaktura)

### Uruchomienie aplikacji poprzez customowe JRE

```shell
./customjre/bin/java -m app/eu.chrost.app.Application
```
