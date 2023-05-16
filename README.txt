https://openapi-generator.tech/
npm install @openapitools/openapi-generator-cli -g

cd /Users/eason/Desktop/openapi

npx openapi-generator-cli generate -i ./swagger-from-server.json -g typescript-fetch -o ./apiClients/netcoreApi
npx openapi-generator-cli generate -i ./swagger-from-server.json -g java -o ./testOpenApiClient
npx openapi-generator-cli generate -i ./swagger-from-server.json -g spring -o ./testOpenApiServer