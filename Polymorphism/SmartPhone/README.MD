# Smart Phone Project

## Project Overview
This project demonstrates a Smart Phone system that utilizes polymorphism through interfaces. It allows for various functionalities such as making calls, taking photos, and playing audio, showcasing the principles of Object-Oriented Programming (OOP).

### Class Descriptions

1. **AudioPlayer.java**
   - This interface defines methods for audio playback functionalities.
   - **Methods**:
     - `playSong()`: Plays a single song.
     - `playPlayList()`: Plays a list of songs.
     - `skipToNextSong()`: Skips to the next song in the playlist.
     - `setVolume(int volume)`: Sets the volume level.

2. **Camera.java**
   - This interface defines methods for camera functionalities.
   - **Methods**:
     - `autoFocus()`: Engages the autofocus feature.
     - `takePhoto()`: Captures a photo.
     - `deletePhoto()`: Deletes a captured photo.
     - `zoom(int percent)`: Zooms in by a specified percentage.

3. **Phone.java**
   - This interface defines methods for phone functionalities.
   - **Methods**:
     - `makeCall(int number)`: Initiates a call to the specified number.
     - `answerCall()`: Answers an incoming call.
     - `lookupContact()`: Looks up a contact in the phone's address book.

4. **MultiSensor.java**
   - This class implements the `TemperatureSensor` interface, providing a method to get a random temperature reading.
   - **Methods**:
     - `getTemperature()`: Returns a random temperature value.

5. **SmartPhone.java**
   - This class implements the `Phone`, `Camera`, and `AudioPlayer` interfaces, providing concrete implementations for all methods.
   - **Functionality**:
     - Handles making calls, taking photos, and playing audio.
     - Implements all methods defined in the interfaces.

6. **Start.java**
   - This is the main class that runs the application. It creates an instance of `SmartPhone`, performs various actions, and demonstrates the functionalities.
   - **Functionality**:
     - Instantiate a `SmartPhone` object.
     - Perform actions like taking a photo, making a call, and playing a song.
     - Demonstrates polymorphism by treating `SmartPhone` as both a `Camera` and a `Phone`.

### How to Run
1. Compile all Java files in the `Polymorphism/SmartPhone` directory.
2. Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display the following actions performed by the `SmartPhone`:
```
Taking photo
Making call
Playing a song
Engaging autofocus
Making call
Answering call
Engaging autofocus
```
