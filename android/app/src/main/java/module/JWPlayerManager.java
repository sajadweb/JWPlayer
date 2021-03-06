package module;



import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.configuration.PlayerConfig;
import com.longtailvideo.jwplayer.media.playlists.PlaylistItem;

public class JWPlayerManager extends SimpleViewManager<JWView> {
    JWPlayerView jwview;
    ThemedReactContext context;
    PlaylistItem pi;
    @Override
    public String getName() {
        return "JWPlayer";
    }

    @Override
    protected JWView createViewInstance(ThemedReactContext reactContext) {
         context = reactContext;
//         PlayerConfig playerConfig = new PlayerConfig.Builder().build();
//         jwview= new JWPlayerView(reactContext,playerConfig);
//         pi= new PlaylistItem.Builder()
//                    .file("http://playertest.longtailvideo.com/adaptive/bipbop/gear4/prog_index.m3u8")
//                    .title("BipBop")
//                    .description("A  player testing video.")
//                    .build();
//         jwview.load(pi);
         return new JWView(reactContext);
//        return new View(context);
    }
//
//    @ReactProp(name= "buttonText")
//    public  void setButtonText(JWPlayerView v, String buttonText){
//
//        if(buttonText.equals( "a" )){
//
//        }
//
//    }

//    @ReactProp(name= "player")
//    public  void setPlayer(JWPlayerView jw,Boolean player){

//        if(start){
////            pi= new PlaylistItem.Builder()
////                    .file("http://playertest.longtailvideo.com/adaptive/bipbop/gear4/prog_index.m3u8")
////                    .title("BipBop")
////                    .description("A   player testing video.")
////                    .build();
////            jw.load(pi);
//        }
//
//    }


}
