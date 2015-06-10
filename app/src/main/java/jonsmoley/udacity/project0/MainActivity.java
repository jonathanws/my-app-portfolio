package jonsmoley.udacity.project0;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
	
	protected Button button1, button2, button3, button4, button5, button6;
	
	/**
	 * onCreate for main activity
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}
	
	/**
	 * Generates the Action Bar Menu Items for the main activity
	 * @param menu
	 * @return
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}
	
	/**
	 * Called when an Action Bar Menu Item is clicked
	 * @param item
	 * @return
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_settings:
				return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	/**
	 * Initialize the buttons on the main activity
	 */
	private void init() {
		button1 = (Button) this.findViewById(R.id.project_1);
		button2 = (Button) this.findViewById(R.id.project_2);
		button3 = (Button) this.findViewById(R.id.project_3);
		button4 = (Button) this.findViewById(R.id.project_4);
		button5 = (Button) this.findViewById(R.id.project_5);
		button6 = (Button) this.findViewById(R.id.project_6);
		
		Button[] all_buttons = {button1, button2, button3, button4, button5, button6};
		
		for (int i = 0; i < all_buttons.length; i++) {
			// Set listeners for each button
			all_buttons[i].setOnClickListener(this);
			
			// Apply a color for each button
			all_buttons[i].setBackgroundColor(getResources().getIntArray(R.array.material_buttoncolors)[i]);
		}
	}
	
	public void onClick(View v) {
		
		Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
		
//		if (v == this.project1) {
//			// Intent to project 1
//		} else if (v == this.project2) {
//			// Intent to project 2
//		} else if (v == this.project3) {
//			// Intent to project 3
//		} else if (v == this.project4) {
//			// Intent to project 4
//		} else if (v == this.project5) {
//			// Intent to project 5
//		}
	}
}