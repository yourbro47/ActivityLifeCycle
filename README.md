# ActivityLifeCycle
The Activity Lifecycle in Android describes the states and callbacks that an Activity goes through during its lifetime. These lifecycle methods help developers manage app behavior during state transitions, such as when the app moves to the foreground, background, or is destroyed.


### **Activity Lifecycle in Android**

1. **`onCreate()`**: Called when the activity is first created. Used to initialize the UI, bind data, and set up essential components.  
2. **`onStart()`**: Called when the activity becomes visible to the user. Prepares the app for interaction but is not yet interactive.  
3. **`onResume()`**: Called when the activity enters the foreground and is ready for user interaction.  
4. **`onPause()`**: Called when the activity loses focus but is still partially visible (e.g., another activity is in the foreground).  
5. **`onStop()`**: Called when the activity is no longer visible. Used to release resources and save data.  
6. **`onDestroy()`**: Called when the activity is being destroyed, either by the user or the system. Used for final cleanup.  

These callbacks help manage the app's behavior during lifecycle transitions.
