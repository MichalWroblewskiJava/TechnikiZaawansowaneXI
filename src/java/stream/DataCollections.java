package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DataCollections {

    private static final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed fermentum justo in nunc facilisis, nec pellentesque sapien viverra. Praesent tristique sollicitudin sapien a imperdiet. Pellentesque tincidunt nec mi a fringilla. Duis rhoncus odio vitae dui fringilla viverra. Ut tristique in diam fermentum placerat. Vivamus viverra vel magna vitae sodales. Maecenas interdum iaculis sodales. Integer consequat molestie justo a finibus. Aenean facilisis lectus odio. Donec non sapien ac dolor pellentesque porttitor. Nunc sit amet pretium ex, et aliquam velit. Duis venenatis leo sit amet magna venenatis, ac iaculis mi dictum. Nunc a tellus sit amet est consectetur consequat et sed lectus. Sed et imperdiet metus, congue malesuada enim. Pellentesque vitae elit in nulla porttitor maximus a nec nisi. " +
            "Fusce id euismod nisl. Praesent vel eros nec justo mattis ultricies. Sed vestibulum a nunc vehicula finibus. Suspendisse pharetra cursus massa, ac varius sapien ultricies quis. Nunc velit mi, vehicula ac porttitor sed, viverra ut tellus. Duis at lorem vel eros tincidunt finibus. Mauris ultricies tempor arcu a laoreet. Nam rutrum, odio sagittis maximus posuere, mi ante mattis magna, eu laoreet ligula mauris eget odio. Mauris egestas magna ac eros condimentum dignissim. Maecenas ac interdum ex, sit amet mollis odio. " +
            "In vel nibh semper, rutrum dolor id, auctor purus. Maecenas imperdiet tristique libero eget vulputate. Fusce eu mi vitae orci sagittis condimentum. Nam ut magna dui. Curabitur in consequat urna. Mauris id mattis massa, a viverra risus. Vestibulum hendrerit malesuada mi. Suspendisse ullamcorper ipsum et ex varius, vitae aliquam nibh vulputate. Duis scelerisque finibus ante luctus scelerisque. Suspendisse in massa at ante pretium ultricies at placerat leo. " +
            "Donec lobortis, elit id tempor consequat, tortor eros mollis lorem, vel feugiat dui metus nec tortor. Donec at rutrum risus, id condimentum tortor. Phasellus et pulvinar urna. Pellentesque vitae augue massa. Nunc vestibulum sapien in nunc suscipit vulputate. Ut id porta neque, vel gravida eros. Donec at auctor orci, ac posuere sem. In hac habitasse platea dictumst. Etiam finibus lacus in fringilla lobortis. Nulla sodales efficitur nisi id vulputate. Morbi neque mi, tincidunt quis quam ac, varius posuere massa. Ut massa leo, fringilla fermentum viverra nec, semper at lorem. Proin id mattis ex, a varius eros. " +
            "Praesent eu consectetur arcu. Sed tincidunt dapibus urna, a tincidunt turpis scelerisque eu. Integer in aliquet sem, fringilla maximus orci. Ut erat velit, auctor vel magna accumsan, convallis efficitur velit. Morbi et aliquet felis. Duis semper sapien ut eros dictum, et lobortis tortor vehicula. Integer ut elementum mauris. Sed pharetra lorem vel dolor elementum, sed suscipit libero pretium. Vivamus viverra turpis a nisi tincidunt elementum. Quisque aliquet pretium diam, in fringilla eros gravida tincidunt. Ut at ullamcorper eros. Cras consectetur est a vehicula dictum. Etiam commodo est vel libero suscipit, ac porttitor quam fermentum. Donec nibh nulla, consectetur et hendrerit ac, varius sed neque. In magna sem, bibendum non dui eu, mollis condimentum tortor. Nunc erat nulla, sagittis tempus fermentum at, faucibus in arcu. " +
            "Donec vitae fermentum dolor. Morbi vitae nisl at nisl ultrices faucibus. Quisque vitae pellentesque ante. Pellentesque metus dui, venenatis sed ultrices quis, cursus vel risus. Nullam finibus interdum augue, non tincidunt massa efficitur sit amet. Aenean ac tortor congue, tincidunt nisl sit amet, accumsan turpis. Nam scelerisque et purus sit amet posuere. Donec suscipit ac duos magna a hendrerit. In hac habitasse platea dictumst. Nulla ex dolor, lacinia sed accumsan quis, congue ac tellus. Cras tempus eros eget leo euismod, vel venenatis nibh elementum. Pellentesque semper vel magna nec luctus. Integer pretium odio sit amet molestie fringilla. Nulla vulputate faucibus laoreet. Aenean ac laoreet nisi. " +
            "Quisque sed nisl finibus, hendrerit felis sit amet, varius dolor. In facilisis imperdiet metus ut vestibulum. Phasellus fermentum nisl a ex porttitor ultricies. Proin eget libero et quam suscipit fermentum. Morbi rutrum risus ut viverra venenatis. Donec commodo sapien sit amet risus maximus consectetur. Cras dictum dictum gravida. Aliquam erat volutpat. Mauris ultrices mi massa, et ornare nisl aliquam eu. Morbi egestas quis dui et condimentum. Vestibulum nulla libero, suscipit ut tellus a, vehicula hendrerit ipsum. Quisque convallis egestas purus, id mattis orci tincidunt vel. Ut volutpat tortor sed ornare eleifend. Proin ipsum sapien, rutrum nec massa in, mollis finibus orci. Duis et mi mauris. " +
            "Aliquam rutrum erat a mauris scelerisque maximus. Aenean ullamcorper sed sem ac sodales. Nulla facilisi. Donec interdum consectetur quam, quis facilisis elit venenatis eget. Fusce accumsan consequat vehicula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam at velit et lorem porta ultrices id vitae risus. Aliquam felis leo, vehicula id malesuada a, efficitur eget felis. Nunc posuere ultricies sapien, vel ornare turpis accumsan ut. Vestibulum in tempor turpis, a semper massa. Vestibulum egestas mauris metus, ultricies lobortis erat ornare quis. " +
            "Phasellus at porttitor nulla. Curabitur placerat pulvinar dignissim. In sodales mauris at fringilla molestie. Phasellus at arcu a ligula interdum bibendum et vitae felis. Aenean id fringilla velit, eget mollis massa. Aliquam convallis ligula vitae enim consequat, porta maximus enim gravida. In sodales feugiat lectus, a feugiat orci lobortis eget. Cras ut pretium mi. Aenean elementum maximus diam, in hendrerit quam sagittis lobortis. Fusce vel elit ac eros tempor mollis at ut ex. " +
            "Quisque euismod lacus et augue luctus tristique. Vestibulum suscipit augue erat, id imperdiet eros fermentum quis. Quisque nulla felis, dictum eu ornare et, ornare quis magna. Phasellus a nibh dignissim ex rutrum suscipit quis vel tortor. Vivamus non risus faucibus elit luctus aliquet. Vestibulum imperdiet enim id tortor facilisis ullamcorper. In a egestas sapien. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed commodo elit felis, non tincidunt mauris sagittis et. Vivamus bibendum tincidunt lacinia. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Curabitur et auctor felis.";

    public static List<String> getLoremIpsum() {
        return Arrays.asList(loremIpsum.split(" "));
    }

    public DataCollections() {
    }

    public static Stream<String> codePoints(String s) {
        var result = new ArrayList<String>();
        int i = 0;
        while (i < s.length()) {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i=j;
        }
        return result.stream();
    }
}
