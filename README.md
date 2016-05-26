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


### Add settings to conf/metrics.properties
* Name:     Default:      Description:
* host      127.0.0.1     Hostname or IP of StatsD server
* port      8125          Port of StatsD server
* period    10            Poll period
* unit      seconds       Units of poll period
* prefix    EMPTY STRING  Prefix to prepend to metric name
* replaceRe EMPTY STRING  The regular expression to look for replacement
* replaceTo EMPTY STRING  The target string to use
e.g.:
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
