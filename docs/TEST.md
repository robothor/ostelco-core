## Testing

 * Configure firebase project - `pantel-tests` or `pantel-2decb`
 
 * Create test subscriber
  
  
    firebase --project pantel-2decb  --data '{"msisdn": "+4747900184", "noOfBytesLeft": 0}' database:push /authorative-user-storage

 * Top up test subscriber
 
 
    firebase --project pantel-2decb  --data '{"msisdn": "+4747900184", "sku": "DataTopup3GB", "paymentToken": "xxxx"}' database:push /client-requests

 * Start docker-compose

    
    gradle build  
    docker-compose up --build  
