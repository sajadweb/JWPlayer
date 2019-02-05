# JWPlayer
#### Sample Project React Native (Android)

```
  <JWPlayer 
            key={'name'}
            ref={ref => {
                if (!ref) return
                JWPlayer.id = ref 
            }}  
            buttonText={this.state ? (this.state.start ? "a" : "false") : "false"}
            style={{ width: 300, height: 300, backgroundColor: "red" }} 
          />
          
```
