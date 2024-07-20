document.addEventListener('DOMContentLoaded', (event) => {
    document.getElementById('send-button').addEventListener('click', function() {
        const region = document.getElementById('region-input').value;
        const companyName = document.getElementById('company-name-input').value;

        const data = {
            region: region,
            companyName: companyName
        };

        alert(`지역: ${data.region}\n회사명: ${data.companyName}`);

        // 여기에 서버로 데이터를 보내는 코드가 추가될 수 있습니다.
        /*
        fetch('https://your-server-endpoint.com/submit', {
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
        .catch((error) => {
            console.error('Error:', error);
            alert('There was an error submitting your data.');
        });
        */
    });

    document.getElementById('log-button').addEventListener('click', function() {
        window.location.href = 'company-log.html';
    });
});
