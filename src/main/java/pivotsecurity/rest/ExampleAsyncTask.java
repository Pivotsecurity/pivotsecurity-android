package pivotsecurity.rest;

class ExampleAsyncTask extends AsyncTask<String, Void, Boolean> {

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected Boolean doInBackground(String... parmas) {
		try {
				Account ac = new Account("<sk_key>","<pk_key>");

				JSONObject jsono = ac.info("<UID>", "<EMAIL>");
				
				//jsono contants the customer info values
		}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {

			e.printStackTrace();
		}
		return false;
	}

	protected void onPostExecute(Boolean result) {

	}
	
}