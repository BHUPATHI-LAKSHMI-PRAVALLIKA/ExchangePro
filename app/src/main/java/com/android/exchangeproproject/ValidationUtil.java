import android.text.TextUtils;

public class ValidationUtil {
    public static boolean isValidInput(String input) {
        return !TextUtils.isEmpty(input) && input.length() > 3;
    }
}
Example Validation in LoginActivity.java:

java
Copy code
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateLoginInput();
            }
        });
    }

    private void validateLoginInput() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (!ValidationUtil.isValidInput(username)) {
            Toast.makeText(this, "Username cannot be empty", Toast.LENGTH_SHORT).show();
        } else if (!ValidationUtil.isValidInput(password)) {
            Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            // Proceed with login logic
        }
    }
}
