#!/bin/bash


for project in lab-2-config-server lab-4-eureka-server lab-4-verb lab-4-subject  lab-4-article lab-4-noun lab-4-adjective lab-4-sentence:ew; do
  # do something like: echo $databaseName

	echo "-------------------"
	echo "Starting: "$project
	echo "screen -dmS $project java -jar $project/target/$project*.jar"
	echo "-------------------"
	screen -dmS $project java -jar $project/target/$project-0.0.1-SNAPSHOT.jar &
	sleep 5
done 
