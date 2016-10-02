HOAEncEigenMike{

	classvar <radialFilters;

	*loadRadialFilters {|server|

		radialFilters = 	[Buffer.read(server,Platform.userExtensionDir++"/HOA/FIR/spherical_microphones/jconvolver_mic_eigenmike32"++"/order_0.wav"),
		                         Buffer.read(server,Platform.userExtensionDir++"/HOA/FIR/spherical_microphones/jconvolver_mic_eigenmike32"++"/order_1.wav"),
		                         Buffer.read(server,Platform.userExtensionDir++"/HOA/FIR/spherical_microphones/jconvolver_mic_eigenmike32"++"/order_2.wav"),
		                         Buffer.read(server,Platform.userExtensionDir++"/HOA/FIR/spherical_microphones/jconvolver_mic_eigenmike32"++"/order_3.wav"),
	 	                         Buffer.read(server,Platform.userExtensionDir++"/HOA/FIR/spherical_microphones/jconvolver_mic_eigenmike32"++"/order_4.wav")];
	}

	*ar { |order, in, gain=0, filters = 1|
		case{order == 1}
                		{var in1,   in2,   in3,   in4,   in5,   in6,   in7,   in8,   in9, in10,
			                   in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                   in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                   in31, in32, encoded;

                              #in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
			                    in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                    in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                    in31, in32 = in;

			                    encoded= FaustHOAEigenmike321.ar(in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
				                                                                      in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
				                                                                      in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
				                                                                      in31, in32,
				                                                                      gain_5: gain);

			if(filters == 0,
				{ ^encoded},
				{if(radialFilters == nil,{"please load the radial filters into buffers first (HOAEncEigenMike.loadRadialFilters)".postln; ^encoded},

					                {// return the encoded b-format convolved with the correct radial filter
				  	                 ^[ Convolution2.ar(  encoded[0], 	radialFilters[0], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[1], 	radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[2], 	radialFilters[1], 0, 4096, 1),
							             Convolution2.ar(  encoded[3], 	radialFilters[1], 0, 4096, 1)]}
				     )
				}
			   )
			}
		       {order == 2}
                		{var   in1,   in2,   in3,   in4,   in5,   in6,   in7,   in8,   in9, in10,
			                   in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                   in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                   in31, in32, encoded;

                              #in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
			                    in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                    in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                    in31, in32 = in;

			                    encoded= FaustHOAEigenmike322.ar(in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
				                                                                      in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
				                                                                      in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
				                                                                      in31, in32,
				                                                                      gain_11: gain);

			if(filters == 0,
				{ ^encoded},
				{if(radialFilters == nil,{"please load the radial filters into buffers first (HOAEncEigenMike.loadRadialFilters)".postln; ^encoded},

					                {// return the encoded b-format convolved with the correct radial filter
				  	                 ^[ Convolution2.ar(  encoded[0], 	radialFilters[0], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[1], 	radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[2], 	radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[3], 	radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[4], 	radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[5], 	radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[6], 	radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[7], 	radialFilters[2], 0, 4096, 1),
							             Convolution2.ar(  encoded[8], 	radialFilters[2], 0, 4096, 1)]}
				)
				}
			   )
			}
               {order == 3}
                		{var   in1,   in2,   in3,   in4,   in5,   in6,   in7,   in8,   in9, in10,
			                   in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                   in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                   in31, in32, encoded;

                              #in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
			                    in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                    in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                    in31, in32 = in;

                                encoded= FaustHOAEigenmike323.ar(in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
				                                                                      in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
				                                                                      in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
				                                                                      in31, in32,
				                                                                      gain_19: gain);

			if(filters == 0,
				{ ^encoded},
				{if(radialFilters == nil,{"please load the radial filters into buffers first (HOAEncEigenMike.loadRadialFilters)".postln; ^encoded},

					                {// return the encoded b-format convolved with the correct radial filter
				  	                 ^[ Convolution2.ar(  encoded[0], 	    radialFilters[0], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[1], 	    radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[2], 	    radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[3], 	    radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[4], 	    radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[5], 	    radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[6], 	    radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[7], 	    radialFilters[2], 0, 4096, 1),
						                 Convolution2.ar(  encoded[8], 	    radialFilters[2], 0, 4096, 1),
							             Convolution2.ar(  encoded[9], 	    radialFilters[3], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[10], 	radialFilters[3], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[11], 	radialFilters[3], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[12], 	radialFilters[3], 0, 4096, 1),
								         Convolution2.ar(  encoded[13], 	radialFilters[3], 0, 4096, 1),
								         Convolution2.ar(  encoded[14], 	radialFilters[3], 0, 4096, 1),
							             Convolution2.ar(  encoded[15], 	radialFilters[3], 0, 4096, 1)]}
				                 )
				}
			   )
			}
               {order == 4}
                		{var   in1,   in2,   in3,   in4,   in5,   in6,   in7,   in8,   in9, in10,
			                   in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                   in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                   in31, in32, encoded;

                              #in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
			                    in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
			                    in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
			                    in31, in32 = in;

			                    encoded= FaustHOAEigenmike324.ar(in1, in2, in3, in4, in5, in6, in7, in8, in9, in10,
				                                                                      in11, in12, in13, in14, in15, in16, in17, in18, in19, in20,
				                                                                      in21, in22, in23, in24, in25, in26, in27, in28, in29, in30,
				                                                                      in31, in32,
				                                                                      gain_29: gain);

			if(filters == 0,
				{ ^encoded},
				{if(radialFilters == nil,{"please load the radial filters into buffers first (HOAEncEigenMike.loadRadialFilters)".postln; ^encoded},

					                {// return the encoded b-format convolved with the correct radial filter
				  	                 ^[ Convolution2.ar(  encoded[0], 	    radialFilters[0], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[1], 	    radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[2], 	    radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[3], 	    radialFilters[1], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[4], 	    radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[5], 	    radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[6], 	    radialFilters[2], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[7], 	    radialFilters[2], 0, 4096, 1),
						                 Convolution2.ar(  encoded[8], 	    radialFilters[2], 0, 4096, 1),
							             Convolution2.ar(  encoded[9], 	    radialFilters[3], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[10], 	radialFilters[3], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[11], 	radialFilters[3], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[12], 	radialFilters[3], 0, 4096, 1),
								         Convolution2.ar(  encoded[13], 	radialFilters[3], 0, 4096, 1),
								         Convolution2.ar(  encoded[14], 	radialFilters[3], 0, 4096, 1),
						                 Convolution2.ar(  encoded[15], 	radialFilters[3], 0, 4096, 1),
								         Convolution2.ar(  encoded[16], 	radialFilters[4], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[17], 	radialFilters[4], 0, 4096, 1),
		                                 Convolution2.ar(  encoded[18], 	radialFilters[4], 0, 4096, 1),
								         Convolution2.ar(  encoded[19], 	radialFilters[4], 0, 4096, 1),
								         Convolution2.ar(  encoded[20], 	radialFilters[4], 0, 4096, 1),
						                 Convolution2.ar(  encoded[21], 	radialFilters[4], 0, 4096, 1),
									     Convolution2.ar(  encoded[22], 	radialFilters[4], 0, 4096, 1),
									     Convolution2.ar(  encoded[23], 	radialFilters[4], 0, 4096, 1),
				               			 Convolution2.ar(  encoded[24], 	radialFilters[4], 0, 4096, 1)]}
				          )
				}
			   )
			}
		       {"this order is not implemented".postln}
	}

}