#!/bin/bash


for project in lab2-config-server lab-4-eureka-server lab-4-subject lab-4-verb lab-4-article lab-4-noun lab-4-adjective lab-4-sentence; do
  # do something like: echo $databaseName

	mvn clean package -f $project/pom.xml -Dmaven.test.skip=true
	#echo "-------------------"
	#echo "Starting: "$project
	#echo "-------------------"
	#screen -dmS $project java -jar $project/target/$project*.jar &
done 
