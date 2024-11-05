<?

// Задача №1

function postApi($text,$url){ //отправляем запрос на внешний API и получаем данные
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_URL, $url);
    curl_setopt($ch, CURLOPT_POST, true);
    curl_setopt($ch, CURLOPT_POSTFIELDS, http_build_query($text));
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    $response = curl_exec($ch);
    curl_close($ch);
    return $response;
}

function getApp ($event_id,$event_date,$ticket_adult_price,$ticket_adult_quantity,$ticket_kid_price,$ticket_kid_quantity){
global $mysql;

$barcode = mt_rand(111111111111111111,99999999999999999999);
$postbook = array("event_id" => $event_id, "event_date" => $event_date,"ticket_adult_price" => $ticket_adult_price,"ticket_adult_quantity" => $ticket_adult_quantity,"ticket_kid_price" => $ticket_kid_price,"ticket_kid_quantity" => $ticket_kid_quantity,"barcode" => $barcode);
$equal_price = $ticket_adult_price + $ticket_kid_price; //общая стоимость билетов
$urlbook = "https://api.site.com/book";
$urlapprove = "https://api.site.com/approve";

$data = json_decode(postApi($postbook,$urlbook), true);

if($data['message'] == 'order successfully booked'){ // успешное принятие

    $goodApi = json_decode(postApi(array("barcode" => $barcode),$urlapprove), true);

    if($goodApi['message'] == 'order successfully aproved'){
        mysqli_query($mysql,"INSERT INTO `zadacha`(`event_id`,`event_date`,`ticket_adult_price`,`ticket_adult_quantity`,`ticket_kid_price`,`ticket_kid_quantity`,`barcode`,`equal_price`) values({$event_id},'{$event_date}',{$ticket_adult_price},{$ticket_adult_quantity},{$ticket_kid_price},{$ticket_kid_quantity},{$barcode},{$equal_price})");
    } else {
         echo 'Возникла ошибка: '.$goodApi['error'];  // выводим ряд ошибок для изучения
    }

} elseif($data['error']  =='barcode already exists'){ // провал пытаемся снова отправить формируя новый уникальный код

$barcodeTwo = mt_rand(111111111111111111,99999999999999999999);
$postbook = array("event_id" => $event_id, "event_date" => $event_date,"ticket_adult_price" => $ticket_adult_price,"ticket_adult_quantity" => $ticket_adult_quantity,"ticket_kid_price" => $ticket_kid_price,"ticket_kid_quantity" => $ticket_kid_quantity,"barcode" => $barcodeTwo);

$twoShanse = json_decode(postApi($postbook,$urlbook), true);  //делаем по новой

if($twoShanse['message'] == 'order successfully booked'){

    $goodApiTwo = json_decode(postApi(array("barcode" => $barcodeTwo),$urlapprove), true);

    if($goodApiTwo['message'] == 'order successfully aproved'){
        mysqli_query($mysql,"INSERT INTO `zadacha`(`event_id`,`event_date`,`ticket_adult_price`,`ticket_adult_quantity`,`ticket_kid_price`,`ticket_kid_quantity`,`barcode`,`equal_price`) values({$event_id},'{$event_date}',{$ticket_adult_price},{$ticket_adult_quantity},{$ticket_kid_price},{$ticket_kid_quantity},{$barcode},{$equal_price})");
    } else {
         echo 'Возникла ошибка: '.$goodApiTwo['error'];  // выводим ряд ошибок для изучения
    }
} else {
    echo 'Вторая попытка провалена: '.$twoShanse['error'];  // выводим ряд ошибок для изучения
}

}

}


getApp(mt_rand(111,333),date("Y-m-d h:i:s", time()),0,1,0,1);
?>

// Задача №2

Оба пункта я понял не до конца, мне нужен реальный пример чтоб я мог тестировать с примерами.

пункт 1. то для добавления в бд дополнительных билетов необходимо добавить колонну с именем dop_bilet которая будет иметь дополнительные
обозначения например  0 - без доп, 1 - льготный, 2 - групповой. При добавлении доп билетов можно передавать функцию getApp значения и
затем производить внутри функции разлиные подсчеты, по итогу будет как то так:

function getApp ($event_id,$event_date,$ticket_adult_price,$ticket_adult_quantity,$ticket_kid_price,$ticket_kid_quantity,$dopBilet){
....
}

getApp(mt_rand(111,333),date("Y-m-d h:i:s", time()),0,1,0,1,2);


пункт 2. Можно создать отдельную таблицу в которую будем добавлять баркоды по отдельности связывая с основной таблицей по barcode и user_id


(Если мое решение не понятное прошу отправить задачу с подробным примером)
