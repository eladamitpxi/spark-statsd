# spark-statsd

StatsD is common wrapper for graphite metrics. This project enables the use of statsd metrics collection via spark metrics.properties file

Scala version 2.10.6
Build version 0.13.6
Spark version 1.6.1

###Steps to create assembly jar

```
git clone git@github.com:eladamitpxi/spark-statsd.git

cd spark-statsd

sbt assembly
```

creates target/scala-2.10/spark-statsd-1.0.1.jar assembly jar file


```
*.sink.statsd.class=org.apache.spark.metrics.sink.StatsDSink
*.sink.statsd.host=localhost
*.sink.statsd.port=8125
```

### Run spark job

e.g.
```
./bin/run-example SparkPi 10 --driver-class-path target/scala-2.10/spark-statsd-1.0.0.jar
```
