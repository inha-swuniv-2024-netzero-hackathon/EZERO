document.addEventListener('DOMContentLoaded', (event) => {
    document.getElementById('send-button').addEventListener('click', function() {
        const address = document.getElementById('address-input').value;
        const productName = document.getElementById('product-name-input').value;
        const quantity = document.getElementById('quantity-input').value;

        const data = {
            address: address,
            productName: productName,
            quantity: quantity
        };

        //alert(`아파트 주소: ${data.address}\n제품명: ${data.productName}\n개수: ${data.quantity}`);

        // 여기에 서버로 데이터를 보내는 코드가 추가될 수 있습니다.

        fetch('http://localhost:8080/api/v1/apartment/add', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            alert('Data submitted successfully!');
        })
    });

    document.getElementById('log-button').addEventListener('click', function() {
        window.location.href = 'admin-log.html';
    });
});
