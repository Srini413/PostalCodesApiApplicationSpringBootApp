# PostalCodesApiApplicationSpringBootApp

## Below preload data used in this application, this data will be loaded whn ever applcation is started to support in build sample data for retrieve API
(3000,'Melbourne');
(2000,'Sydney');
(5000,'Adelaide');
(90002,'California');
(75001,'Texas');
(4000,'Brisbane');
(46360,'Michigan');
(48212,'Detroit');

##API1 : TO RETRIEVE DATA WITHIN SOME RANGE 
URL : http://localhost:8080/getCities?startcode=1&endcode=99999
HTTP Method: GET
startcode: Starting index of postal code range
endcode  : Ending index of postal code range

Sample OutPut: {
    "cities": [
        "Adelaide",
        "Brisbane",
        "California",
        "Detroit",
        "Melbourne",
        "Michigan",
        "Sydney",
        "Texas"
    ],
    "count": 61
}

### API 2: TO POST DATA TO THE H2 DATABASE
http://localhost:8080/storeData
HTTP Method: POST
Headers : [{"key":"Content-Type","value":"application/json","description":""}]
Body:
[{
  "code":110047,
  "city":"Delhi"
},{
    "code":4999077,
  "city":"Hong Kong"
},
{  "code":66777,
  "city":"Toronto"
  
}]

### Data source url: http://localhost:8080/h2-console/login.do?
JDBC URL :jdbc:h2:mem:postal_details






