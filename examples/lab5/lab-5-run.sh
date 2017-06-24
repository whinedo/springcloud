#!/bin/bash


#for project in lab2-config-server lab-4-eureka-server lab-4-verb lab-4-subject  lab-4-article lab-4-noun lab-4-adjective lab-4-sentence; do
#  # do something like: echo $databaseName
#
#	echo "-------------------"
#	echo "Starting: "$project
#	echo "screen -dmS $project java -jar $project/target/$project*.jar"
#	echo "-------------------"
#	screen -dmS $project java -jar $project/target/$project-0.0.1-SNAPSHOT.jar &
#	sleep 5
#done 


project="lab2-config-server"
screen -dmS $project java -jar ../$project/target/$project-0.0.1-SNAPSHOT.jar &

project="lab-4-eureka-server"
screen -dmS $project-1 java -jar ../lab4/$project/target/$project-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=primary & 
screen -dmS $project-2 java -jar ../lab4/$project/target/$project-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=secondary &
screen -dmS $project-3 java -jar ../lab4/$project/target/$project-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=tertiary &

cd lab-4-client
for project in verb subject article noun adjective sentence; do
  # do something like: echo $databaseName

	echo "-------------------"
	echo "Starting: "$project
	echo "-------------------"
#	screen -dmS $project java -jar $project/target/$project-0.0.1-SNAPSHOT.jar &
	screen -dmS $project mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=$project" &
	sleep 5
done 

