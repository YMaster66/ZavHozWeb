// MainActivity.java
package https://ymaster66.github.io/ZavHozWeb/;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSendFeedback, btnSendOrder;
    EditText etName, etPhone, etEmail, etMessage, etProductName, etProductQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendFeedback = findViewById(R.id.btnSendFeedback);
        btnSendOrder = findViewById(R.id.btnSendOrder);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);
        etMessage = findViewById(R.id.etMessage);
        etProductName = findViewById(R.id.etProductName);
        etProductQuantity = findViewById(R.id.etProductQuantity);

        btnSendFeedback.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String phone = etPhone.getText().toString();
            String email = etEmail.getText().toString();
            String message = etMessage.getText().toString();

            // Проверка валидности данных (необходимо добавить)

            // Отправка обратной связи (реализовать с помощью Firebase, API или другой системы)

            Toast.makeText(MainActivity.this, "Обратная связь отправлена", Toast.LENGTH_SHORT).show();
        });

        btnSendOrder.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String phone = etPhone.getText().toString();
            String email = etEmail.getText().toString();
            String productName = etProductName.getText().toString();
            String productQuantity = etProductQuantity.getText().toString();

            // Проверка валидности данных (необходимо добавить)

            // Отправка заявки на покупку (реализовать с помощью Firebase, API или другой системы)

            Toast.makeText(MainActivity.this, "Заявка отправлена", Toast.LENGTH_SHORT).show();
        });
    }
}
