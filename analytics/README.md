# Analytics

## Setup

1. In Google Cloud Platform, need to setup a project with PubSubIO, Dataflow and BigQueryIO.
2. Keep the `pantel-prod.json` auth file in config folder.

## Package
 
    gradle clean shadowJar

With unit testing:
    
    gradle clean test shadowJar

## Deploy to GCP

    sudo docker-compose up --build