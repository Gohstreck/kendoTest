#!/bin/bash
e_vol=$(docker volume ls | grep "kendo" | cut -d' ' -f2- )
kendo_vol="kendoVol"

createVolume() {
	if [[ $e_vol ]]; then
		echo "Deleting kendo related volumes"
		for output in $e_vol
		do
			docker volume rm $output
		done
		echo "Deleting done"
		echo "Creating new kendo volume"
		docker volume create $kendo_vol
	else
		echo "No kendo volume found"
		echo "Creating new kendo volume"
		docker volume create $kendo_vol

	fi
	return 0
}

createImage(){
		docker-compose up --build -d
		#docker images
	return 0
}

runBack(){
	cd KendoDemo2
	mvn clean package
	java -jar target/KendoDemo2-0.0.1-SNAPSHOT.jar
	
}
passSQL(){
	container_id=$(docker ps | grep kendotest_data | cut -d' ' -f-1)
	docker exec -i $container_id mysql -u root -p123qwe kendoDB < sqlScripts/tablas.sql
}

createImage
runBack
#passSQL
