[![CI/CD Pipeline](https://github.com/JuanVasquezO/laboratorio2024/actions/workflows/build.yml/badge.svg)](https://github.com/JuanVasquezO/laboratorio2024/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=JuanVasquezO_laboratorio2024&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=JuanVasquezO_laboratorio2024)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=JuanVasquezO_laboratorio2024&metric=bugs)](https://sonarcloud.io/summary/new_code?id=JuanVasquezO_laboratorio2024)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=JuanVasquezO_laboratorio2024&metric=coverage)](https://sonarcloud.io/summary/new_code?id=JuanVasquezO_laboratorio2024)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=JuanVasquezO_laboratorio2024&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=JuanVasquezO_laboratorio2024)



Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random aviation
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```